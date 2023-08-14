package com.part07.day53.code.two;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/8/14
 * @desc
 */
public abstract class FileSystemNode {
    protected String path;
    
    public FileSystemNode(String path) {
        this.path = path;
    }
    
    public abstract int countNumOfFiles();
    
    public abstract long countSizeOfFiles();
    
    public String getPath() {
        return path;
    }
}
