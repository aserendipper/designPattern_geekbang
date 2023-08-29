package com.part08.day65.code.one;

/**
 * @author aserendipper
 * @date 2023/8/29
 * @desc
 */
public interface Iterator<E> {
    boolean hasNext();
    void next();
    E currentItem();
}
