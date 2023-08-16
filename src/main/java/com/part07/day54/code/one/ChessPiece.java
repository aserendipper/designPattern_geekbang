package com.part07.day54.code.one;

/**
 * @author aserendipper
 * @date 2023/8/16
 * @desc
 */
public class ChessPiece {
    private int id;
    private String text;
    private Color color;
    private int positionX;
    private int positionY;

    public ChessPiece(int id, String text, Color color, int positionX, int positionY) {
        this.id = id;
        this.text = text;
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    //...省略其他属性和getter/setter方法...
    

    public enum Color {
        RED, BLACK
    }
}
