package com.part03.day18.code.three;

import java.util.Collection;

/**
 * @author aserendipper
 * @date 2023/7/5
 * @desc
 */
public class Statistics {
    private long max;
    private long min;
    private long average;
    private long sum;
    private long percentile99;
    private long percentile999;
    
    public long max(Collection<Long> dataSet) {
        return dataSet.stream().max(Long::compareTo).get();
    }
    
    public long min(Collection<Long> dataSet) {
        return dataSet.stream().min(Long::compareTo).get();
    }
    
}
