package com.part07.day54.code.two;

/**
 * @author aserendipper
 * @date 2023/8/16
 * @desc
 */
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    //...省略其他属性和getter/setter方法...
    

    public enum Color {
        RED, BLACK
    }
}
