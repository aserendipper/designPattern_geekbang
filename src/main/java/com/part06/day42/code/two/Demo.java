package com.part06.day42.code.two;

import com.part06.day41.code.two.IdGenerator;

/**
 * @author aserendipper
 * @date 2023/7/30
 * @desc
 */
public class Demo {
    /**
     * 一般实现方式
     */
    public void demofunction() {
        long id = IdGenerator.getInstance().getId();
    }

    /**
     * 依赖注入实现方式
     */
    public void demofunction2(IdGenerator idGenerator) {
        long id = idGenerator.getId();
    }

    public void test() {
        IdGenerator idGenerator = IdGenerator.getInstance();
        demofunction2(idGenerator);
    }
}
