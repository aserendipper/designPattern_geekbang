package com.part03.day18.code.six;

import com.part03.day18.code.five.Updater;
import com.part03.day18.code.four.ConfigSource;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc
 */
public class RedisConfig implements Updater, Viewer {

    private ConfigSource configSource;
    public RedisConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    //省略其他代码
    @Override
    public void update() {
        System.out.println("RedisConfig.update");
    }

    @Override
    public String outputInPlainText() {
        return null;
    }

    @Override
    public Map<String, String> output() {
        return null;
    }
}
