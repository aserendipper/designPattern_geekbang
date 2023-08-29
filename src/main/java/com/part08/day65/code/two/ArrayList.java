package com.part08.day65.code.two;

import com.part08.day65.code.one.ArrayIterator;
import com.part08.day65.code.one.Iterator;

/**
 * @author aserendipper
 * @date 2023/8/29
 * @desc
 */
public class ArrayList<E> implements List<E> {

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator(this);
    }
}
