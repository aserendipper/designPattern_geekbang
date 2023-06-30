package com.part02.day14.code;

/**
 * @author aserendipper
 * @date 2023/6/29
 * @desc 接口鉴权
 */
public interface ApiAuthencator {
    void auth(String url);
    void auth(ApiRequest apiRequest);
}
