package com.part08.day62.code.one;

/**
 * @author aserendipper
 * @date 2023/8/26
 * @desc
 */
public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;
    
    public void addHandler(Handler handler) {
        handler.successor = null;
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.successor = handler;
        tail = handler;
    }
    
    public void handle() {
        if (head != null) {
            head.handle();;
        }
    }
}
