package com.part07.day51.code.two;

/**
 * @author aserendipper
 * @date 2023/8/11
 * @desc
 */
public class CDAdaptor extends CD implements ITarget {

    @Override
    public void function1() {
        super.staticMethod();
    }

    @Override
    public void function2() {
        super.uglyNamingMethod();
    }

    @Override
    public void function3(Param param) {
        super.tooManyParamsMethod(param.getParam1(), param.getParam2(), param.getParam3(), param.getParam4());
    }

    @Override
    public void function4() {
        // ...re implement function4
    }
}
