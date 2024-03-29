package com.part07.day53.code.one;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/8/14
 * @desc
 */
public class FileSystemNode {
    private String path;
    private boolean isFile;
    private List<FileSystemNode> subNodes = new ArrayList<>();

    public FileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }
    
    public int countNumOfFiles() {
        if (isFile) {
            return 1;
        }
        int sum = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            sum += fileOrDir.countNumOfFiles();
        }
        return sum;
    }
    
    public long countSizeOfFiles() {
        if (isFile) {
            File file = new File(path);
            if (!file.exists()) {
                return 0;
            }
            return file.length();
        }
        long sum = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            sum += fileOrDir.countSizeOfFiles();
        }
        return sum;
    }
    
    public String getPath() {
        return path;
    }
    
    public void addSubNode(FileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }
    
    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; i++) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
    
}
