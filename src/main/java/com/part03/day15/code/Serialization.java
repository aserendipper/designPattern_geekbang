package com.part03.day15.code;

import java.util.Collections;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/6/30
 * @desc 模拟序列化
 */
public class Serialization {
    private static final String IDENTIFIER_STRING = "UEUEUE;";
    /**
     * 由于要引入新的jar包，这里新建一个类只模拟一下
     */
    private Gson gson = new Gson();

    public Serialization(Gson gson) {
        this.gson = gson;
    }
    private String serialize(Map<String, String> object) {
        StringBuilder sb = new StringBuilder();
        sb.append(IDENTIFIER_STRING);
        sb.append(gson.toJson(object));
        return sb.toString();
    }
    
    private Map<String, String> deserialize(String str) {
        if (!str.startsWith(IDENTIFIER_STRING)) {
            return Collections.emptyMap();
        }
        String json = str.substring(IDENTIFIER_STRING.length());
        return gson.fromJson(json, Map.class);
    }
}
