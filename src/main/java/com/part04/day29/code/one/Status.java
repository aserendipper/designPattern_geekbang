package com.part04.day29.code.one;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public enum Status {
    TO_BE_EXECUTED(1, "待执行"),
    EXECUTED(2, "已执行"),
    EXECUTED_FAILED(3, "执行失败"),
    EXPIRED(4, "已过期"),
    CLOSED(5, "已关闭");

    private int code;
    private String desc;

    Status(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
