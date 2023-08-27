package com.part08.day64.code.two;

/**
 * @author aserendipper
 * @date 2023/8/27
 * @desc
 */
public enum Event {
    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MET_MONSTER(3)
    ;
    private int value;

    private Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
