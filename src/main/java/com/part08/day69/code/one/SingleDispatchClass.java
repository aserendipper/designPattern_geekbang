package com.part08.day69.code.one;

/**
 * @author aserendipper
 * @date 2023/9/6
 * @desc
 */
public class SingleDispatchClass {
    public void polymorphismFunction(ParentClass parentClass) {
        parentClass.f();
    }

    public void overloadFunction(ParentClass parentClass) {
        parentClass.f();
        System.out.println("overloadFunction(ParentClass parentClass)");
    }

    public void overloadFunction(ChildClass childClass) {
        childClass.f();
        System.out.println("overloadFunction(ChildClass childClass)");
    }
}
