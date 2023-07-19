package com.part04.day29.code.one;

import org.apache.commons.lang3.RandomUtils;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class RedisDistributedLock {

    public static Object getSingletonInstance() {
        return null;
    }

    public static boolean lockTransction(String id) {
//        return RandomUtils.nextBoolean();
        return true;
    }

    public static void unlock(String id) {
        
    }
}
