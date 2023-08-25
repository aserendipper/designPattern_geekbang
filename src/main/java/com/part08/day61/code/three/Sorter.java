package com.part08.day61.code.three;

import java.io.File;

import com.part08.day61.code.two.ISortAlg;

public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg;
        if (fileSize < 6 * GB) {
            sortAlg = SortAlgFactory.getSortAlg("QuickSort");
        } else if (fileSize < 10 * GB) {
            sortAlg = SortAlgFactory.getSortAlg("ExternalSort");
        } else if (fileSize < 100 * GB) {
            sortAlg = SortAlgFactory.getSortAlg("ConcurrentExternalSort");
        } else {
            sortAlg = SortAlgFactory.getSortAlg("MapReduceSort");
        }  
        sortAlg.sort(filePath);
    }
}
