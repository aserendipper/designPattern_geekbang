package com.part02.day08.code.filter;

/**
 * @author aserendipper
 * @date 2023/6/20
 * @desc 接口
 */
public interface Filter {
    public String str = "hello";
    void doFilter(RPCRequest req) throws Exception;
    
//    private void test() {
//        System.out.println("test");
//    }
    default void test2() {
        System.out.println("test2");
    }
//    protected void test3() {
//        System.out.println("test3");
//    }
    
    public static void test4() {
        System.out.println("test4");
    }
}
