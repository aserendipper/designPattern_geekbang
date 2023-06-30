package com.part02.day14.code.impl;

import com.part02.day14.code.ApiAuthencator;
import com.part02.day14.code.ApiRequest;
import com.part02.day14.code.AuthToken;
import com.part02.day14.code.CredentialStorage;

/**
 * @author aserendipper
 * @date 2023/6/29
 * @desc 默认接口鉴权实现类
 */
public class DefaultApiAuthencatorImpl implements ApiAuthencator {
    private CredentialStorage credentialStorage;

    public DefaultApiAuthencatorImpl() {
        this.credentialStorage = new MysqlCredentialStorage();
    }

    public DefaultApiAuthencatorImpl(CredentialStorage credentialStorage) {
        this.credentialStorage = credentialStorage;
    }

    @Override
    public void auth(String url) {
        ApiRequest apiRequest = ApiRequest.buildFromUrl(url);
        auth(apiRequest);
    }

    @Override
    public void auth(ApiRequest apiRequest) {
        String appId = apiRequest.getAppId();
        String token = apiRequest.getToken();
        long timestamp = apiRequest.getTimestamp();
        String baseUrl = apiRequest.getBaseUrl();

        AuthToken clientAuthToken = new AuthToken(token, timestamp);
        if (clientAuthToken.isExpired()) {
            throw new RuntimeException("Token is expired.");
        }
        String passwordByAppId = credentialStorage.getPasswordByAppId(appId);
        AuthToken serverAuthToken = AuthToken.create(baseUrl, timestamp, apiRequest.getParamMap());
        if (!serverAuthToken.match(clientAuthToken)) {
            throw new RuntimeException("Token verfication failed.");
        }
    }
}
