package com.part03.day18.code.six;

import com.part03.day18.code.four.ConfigSource;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc
 */
public class MysqlConfig implements Viewer  {
    private ConfigSource configSource;
    public MysqlConfig(ConfigSource configSource) {
        this.configSource = configSource;
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
