package com.part02.day08.code.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/6/20
 * @desc 过滤器使用demo
 */
public class Application {
    private List<Filter> filters = new ArrayList<>();
//    filters.add(new AuthencationFilter());
//    filters.add(new RateLimitFilter());
    public void handleRpcRequest(RPCRequest req) {
        try {
            for (Filter filter : filters) {
                filter.doFilter(req);
            }
        } catch (Exception e) {
            //...处理过滤结果...
        }
        //...省略其他处理逻辑...
    }
}
