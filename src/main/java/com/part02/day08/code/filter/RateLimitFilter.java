package com.part02.day08.code.filter;

/**
 * @author aserendipper
 * @date 2023/6/20
 * @desc 接口实现类：限流过滤器
 */
public class RateLimitFilter implements Filter {

    @Override
    public void doFilter(RPCRequest req) throws Exception {
        //...限流逻辑...
    }
}
