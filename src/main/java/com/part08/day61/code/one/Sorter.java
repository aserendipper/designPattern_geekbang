package com.part08.day61.code.one;

import java.io.File;

public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        if (fileSize < 6 * GB) {
            quickSort(filePath);
        } else if (fileSize < 10 * GB) {
            externalSort(filePath);
        } else if (fileSize < 100 * GB) {
            concurrentExternalSort(filePath);
        } else {
            mapReduceSort(filePath);
        }  
    }

    private void mapReduceSort(String filePath) {
    }

    private void concurrentExternalSort(String filePath) {

    }

    private void externalSort(String filePath) {

    }

    private void quickSort(String filePath) {
        
    }
}
