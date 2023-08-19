package com.part08.day57.code.three;

import java.util.concurrent.Executor;

/**
 * @author aserendipper
 * @date 2023/8/19
 * @desc
 */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
