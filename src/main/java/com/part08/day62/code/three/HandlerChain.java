package com.part08.day62.code.three;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/8/26
 * @desc
 */
public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }
    
    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
