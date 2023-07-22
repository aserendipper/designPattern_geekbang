package com.part04.day33.code.six;

import java.util.Date;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc
 */
public class Example {
    public double test1(double radius) {
        return 3.14 * radius * radius;
    }

    //常量替代魔法数
    
    public static final double PI = 3.14;
    public double test2(double radius) {
        return PI * radius * radius;
    }


    public static final Date SUMMER_START = new Date(2023, 6, 1);
    public static final Date SUMMER_END = new Date(2023, 8, 31);
    public void test3() {
        Date date = new Date();
        if (date.after(SUMMER_START) && date.before(SUMMER_END)) {
            System.out.println("在夏天");
        } else {
            System.out.println("不在夏天");
        }
    }

    /**
     * 引入解释性变量后使逻辑更清晰
     */
    public void test4() {
        Date date = new Date();
        boolean isSummer = date.after(SUMMER_START) && date.before(SUMMER_END);
        if (isSummer) {
            System.out.println("在夏天");
        } else {
            System.out.println("不在夏天");
        }
    }
}
