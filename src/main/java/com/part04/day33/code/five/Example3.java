package com.part04.day33.code.five;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc
 */
public class Example3 {
    /**
     * 重构前的代码
     */
    public List<String> test1(List<String> strList, String substr) {
        List<String> matchedStrings = new ArrayList<>();
        if (strList != null && substr != null) {
            for (String str : strList) {
                if (str != null) {
                    if (str.contains(substr)) {
                        matchedStrings.add(str);
                    }
                }
            }
        }
        return matchedStrings;
    }
    /**
     * 重构后的代码: 先执行判空逻辑，再执行正常逻辑
     */
    public List<String> test2(List<String> strList, String substr) {
        if (strList == null || substr == null) {
            return null;
        }
        List<String> matchedStrings = new ArrayList<>();
        for (String str : strList) {
            if (str != null) {
                if (str.contains(substr)) {
                    matchedStrings.add(str);
                }
            }
        }
        return matchedStrings;
    }
}
