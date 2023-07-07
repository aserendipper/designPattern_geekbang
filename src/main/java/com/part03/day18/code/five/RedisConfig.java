package com.part03.day18.code.five;

import com.part03.day18.code.four.ConfigSource;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc
 */
public class RedisConfig implements Updater {

    private ConfigSource configSource;
    public RedisConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    //省略其他代码
    @Override
    public void update() {
        System.out.println("RedisConfig.update");
    }
}
