package com.part08.day62.code.four;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/8/26
 * @desc
 */
public class SensitiveWordFilterChain {
    private List<SensitiveWordFilter> filters = new ArrayList<>();
    
    public void addFilter(SensitiveWordFilter filter) {
        filters.add(filter);
    }
    
    public boolean filter(Content content) {
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
