package com.part07.day51.code.four;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/8/11
 * @desc
 */
public class RiskManagement {
    private List<ISensitiveWordsFilter> filters = new ArrayList<>();
    
    public void addSensitiveWordsFilter(ISensitiveWordsFilter filter) {
        filters.add(filter);
    }
    
    public String filterSensitiveWords(String text) {
        String maskedText = text;
        for (ISensitiveWordsFilter filter : filters) {
            maskedText = filter.filter(text);
        }
        return maskedText;
    }
}
