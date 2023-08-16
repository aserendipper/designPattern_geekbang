package com.part07.day54.code.two;

/**
 * @author aserendipper
 * @date 2023/8/16
 * @desc
 */
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;

    public ChessPiece(ChessPieceUnit chessPieceUnit, int positionX, int positionY) {
        this.chessPieceUnit = chessPieceUnit;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    //...省略其他属性和getter/setter方法...
    
}
