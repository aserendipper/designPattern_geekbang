package com.part03.day17.code.one;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @author aserendipper
 * @date 2023/7/4
 * @desc
 */
public class SecurityTransporter extends Transporter {
    private String appId;
    private String appToken;
    public SecurityTransporter(HttpClient httpClient, String appId, String appToken) {
        super(httpClient);
        this.appId = appId;
        this.appToken = appToken;
    }

    @Override
    public Response sendRequest(Request request) {
        if (appId != null && appToken != null) {
        }
        return super.sendRequest(request);
    }
}
