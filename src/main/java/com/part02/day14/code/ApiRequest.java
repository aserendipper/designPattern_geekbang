package com.part02.day14.code;

import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/6/29
 * @desc
 */
public class ApiRequest {
    private String baseUrl;
    private String token;
    private String appId;
    private long timestamp;
    
    private Map<String, String> paramMap;

    public ApiRequest(String baseUrl, String token, String appId, long timestamp) {
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timestamp = timestamp;
    }

    public static ApiRequest buildFromUrl(String url) {
        return null;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public Map<String, String> getParamMap() {
        return paramMap;
    }
}
