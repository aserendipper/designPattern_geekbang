package com.part08.day62.code.one;

/**
 * @author aserendipper
 * @date 2023/8/26
 * @desc
 */
public class HandlerB extends Handler {

    @Override
    public void handle() {
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
