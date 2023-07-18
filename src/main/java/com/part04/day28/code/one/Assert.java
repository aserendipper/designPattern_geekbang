package com.part04.day28.code.one;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class Assert {
    public static void assertEquals(Integer expectedValue, Integer actualValue) {
        if (!expectedValue.equals(actualValue)) {
            String message = String.format("Test failed, expected: %d, actual %d.", expectedValue, actualValue);
            System.out.println(message);
        } else {
            System.out.println("Test succeeded.");
        }
    }
    
    public static boolean assertNull(Integer actualValue) {
        boolean isNull = actualValue == null;
        if (isNull) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed, the value is not null:" + actualValue);
        }
        return isNull;
    }
    
}
