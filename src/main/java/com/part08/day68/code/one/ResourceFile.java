package com.part08.day68.code.one;

/**
 * @author aserendipper
 * @date 2023/9/3
 * @desc
 */
public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract void extract2txt();
}
