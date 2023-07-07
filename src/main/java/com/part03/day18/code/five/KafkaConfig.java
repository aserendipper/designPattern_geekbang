package com.part03.day18.code.five;

import com.part03.day18.code.four.ConfigSource;

public class KafkaConfig implements Updater {
    private ConfigSource configSource;
    public KafkaConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }
    //省略其他代码
    @Override
    public void update() {
        System.out.println("KafkaConfig.update");
    }
    
}
