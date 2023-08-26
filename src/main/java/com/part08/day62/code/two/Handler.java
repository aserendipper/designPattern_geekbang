package com.part08.day62.code.two;

/**
 * @author aserendipper
 * @date 2023/8/26
 * @desc
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        if (successor == null && !handled) {
            successor.handle();
        }
    }
    
    protected abstract boolean doHandle();
}
