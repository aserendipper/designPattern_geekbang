package com.part07.day54.code.two;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/8/16
 * @desc
 */
public class ChessBoard {
    private Map<Integer, ChessPiece> chessPieces = new HashMap<>();
    
    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPiece(1), 0, 0));
        chessPieces.put(2, new ChessPiece(ChessPieceUnitFactory.getChessPiece(2),  0, 1));
        // ...
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        // ...
    }
}
