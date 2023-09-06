package com.part08.day69.code.one;

/**
 * @author aserendipper
 * @date 2023/9/6
 * @desc
 */
public class DemoMain {

    public static void main(String[] args) {
        SingleDispatchClass singleDispatchClass = new SingleDispatchClass();
        ParentClass parentClass = new ChildClass();
        singleDispatchClass.polymorphismFunction(parentClass);
        singleDispatchClass.overloadFunction(parentClass);
    }
}
