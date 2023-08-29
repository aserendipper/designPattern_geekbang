package com.part08.day65.code.one;

import java.util.ArrayList;

/**
 * @author aserendipper
 * @date 2023/8/29
 * @desc
 */
public class Demo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        
        Iterator<ArrayList> iterator = new ArrayIterator(arrayList);
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
