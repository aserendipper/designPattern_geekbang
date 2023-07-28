package com.part05.day39.code.one;

import com.part03.day26.code.one.RequestStat;

import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/7/26
 * @desc
 */
public class ConsoleViewer implements StatViewer {
    @Override
    public void output(Map<String, RequestStat> requestStatMap, long startTimeInMillis, long endTimeInMillis) {
        System.out.println("Time Span: [" + startTimeInMillis + ", " + endTimeInMillis + "]");
        System.out.println(requestStatMap);
    }
}
