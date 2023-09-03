package com.part08.day68.code.two;

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

    public abstract void accept(Vistor vistor);
}
