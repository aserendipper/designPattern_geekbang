package com.part03.day18.code.six;


import com.part03.day18.code.five.ScheduledUpdater;
import com.part03.day18.code.four.ConfigSource;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc
 */
public class Application {
    static ConfigSource configSource = new ConfigSource();
    public static final RedisConfig redisConfig  = new RedisConfig(configSource);
    public static final KafkaConfig kafkaConfig  = new KafkaConfig(configSource);
    public static final MysqlConfig mysqlConfig  = new MysqlConfig(configSource);

    public static void main(String[] args) {
        ScheduledUpdater redisConfigUpdater = new ScheduledUpdater((ScheduledExecutorService) configSource, 300, 300);
        redisConfigUpdater.run();

        ScheduledUpdater kafkaConfigUpdater = new ScheduledUpdater((ScheduledExecutorService) configSource, 60, 60);
        kafkaConfigUpdater.run();
        
        SimpleHttpServer simpleHttpServer = new SimpleHttpServer("127.0.0.1", 2389);
        simpleHttpServer.addViewers("/config", redisConfig);
        simpleHttpServer.addViewers("/config", mysqlConfig);
        simpleHttpServer.run();
    }
}
