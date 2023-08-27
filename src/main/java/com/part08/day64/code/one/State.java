package com.part08.day64.code.one;

/**
 * @author aserendipper
 * @date 2023/8/27
 * @desc
 */
public enum State {
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3)
    ;
    private int value;

    private State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
