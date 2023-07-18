package com.part04.day28.code.one;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class TestCaseRunner {

    public static void main(String[] args) {
        System.out.println("Run testToNumber()");
        new TextTest().testToNumber();
        
        System.out.println("Run testToNumber_nullOrEmpty()");
        new TextTest().testToNumber_nullOrEmpty();

        System.out.println("Run testToNumber_containsLeadingAndTrailingSpaces()");
        new TextTest().testToNumber_containsLeadingAndTrailingSpaces();

        System.out.println("Run testToNumber_containsMultiLeadingAndTrailingSpaces()");
        new TextTest().testToNumber_containsMultiLeadingAndTrailingSpaces();

        System.out.println("Run testToNumber_containsInvalidCharaters()");
        new TextTest().testToNumber_containsInvalidCharaters();
    }
}
