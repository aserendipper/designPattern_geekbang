package com.part07.day51.code.four;

import com.part07.day51.code.three.ASensitiveWordsFilter;

/**
 * @author aserendipper
 * @date 2023/8/11
 * @desc
 */
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private ASensitiveWordsFilter aFilter;
    @Override
    public String filter(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }
}
