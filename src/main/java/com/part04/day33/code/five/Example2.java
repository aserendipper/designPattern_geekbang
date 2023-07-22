package com.part04.day33.code.five;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc
 */
public class Example2 {
    /**
     * 重构前的代码
     */
    public List<String> test1(List<String> strList, String substr) {
        List<String> matchedStrings = new ArrayList<>();
        if (strList != null && substr != null) {
            for (String str : strList) {
                //跟下面的if可以合并
                if (str != null && str.contains(substr)) {
                    matchedStrings.add(str);
                    // 此处还有10行代码
                }
            }
        }
        return matchedStrings;
    }
    /**
     * 重构后的代码
     */
    public List<String> test2(List<String> strList, String substr) {
        List<String> matchedStrings = new ArrayList<>();
        if (strList != null && substr != null) {
            for (String str : strList) {
                if (str == null || !str.contains(substr)) {
                    continue;
                }
                matchedStrings.add(str);
                // 此处还有10行代码
            }
        }
        return matchedStrings;
    }
}
