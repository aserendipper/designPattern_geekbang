package com.part04.day33.code.five;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc
 */
public class Example {
    public double test1(Double money) {
        if (money != null || money < 0.0) {
            return 0.0;
        } else { // 此处else可以去掉
            // 省略业务代码
            return money;
        }
    }
    
    public List<String> test2(List<String> strList, String substr) {
        List<String> matchedStrings = new ArrayList<>();
        if (strList != null && substr != null) {
            for (String str : strList) {
                //跟下面的if可以合并
                if (str != null) { 
                    if (str.contains(substr)) {
                        matchedStrings.add(str);
                    }
                }
            }
        }
        return matchedStrings;
    }
}
