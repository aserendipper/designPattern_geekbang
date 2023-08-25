package com.part08.day61.code.three;

import java.util.HashMap;
import java.util.Map;

import com.part08.day61.code.two.ConcurrentExternalSort;
import com.part08.day61.code.two.ExternalSort;
import com.part08.day61.code.two.ISortAlg;
import com.part08.day61.code.two.MapReduceSort;
import com.part08.day61.code.two.QuickSort;

public class SortAlgFactory {
    private static final Map<String, ISortAlg> algs = new HashMap<>();
    
    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return algs.get(type);
    }
}
