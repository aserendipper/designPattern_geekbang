package com.part07.day54.code.two;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/8/16
 * @desc
 */
public class ChessPieceUnitFactory {
    private static final Map<Integer, ChessPieceUnit> pieces = new HashMap<>();
    
    static {
        pieces.put(1, new ChessPieceUnit(1, "车", ChessPieceUnit.Color.BLACK));
        pieces.put(2, new ChessPieceUnit(2, "马", ChessPieceUnit.Color.BLACK));
    }
    
    public static ChessPieceUnit getChessPiece(int chessPieceId) {
        return pieces.get(chessPieceId);
    }
}
