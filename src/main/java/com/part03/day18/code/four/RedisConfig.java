package com.part03.day18.code.four;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc
 */
public class RedisConfig {
    private ConfigSource configSource;
    private String address;
    private int timeout;
    private int maxTotal;
    private int maxIdle;
    // 省略其他配置: maxWaitMillis,minIdle, testOnBorrow,testOnReturn, testWhileIdle, etc.

    public RedisConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }
    // 省略其他getXXX()方法
    public void update() {
        // 从configSource加载配置到address/timeout/maxTotal/maxIdle等字段中
    }
}
