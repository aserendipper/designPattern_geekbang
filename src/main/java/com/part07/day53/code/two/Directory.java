package com.part07.day53.code.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/8/14
 * @desc
 */
public class Directory extends FileSystemNode {
    private List<FileSystemNode> subNodes = new ArrayList<>();

    public Directory(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        int sum = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            sum += fileOrDir.countNumOfFiles();
        }
        return sum;
    }

    @Override
    public long countSizeOfFiles() {
        long sum = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            sum += fileOrDir.countSizeOfFiles();
        }
        return sum;
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
