package com.part08.day62.code.one;

/**
 * @author aserendipper
 * @date 2023/8/26
 * @desc
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}
