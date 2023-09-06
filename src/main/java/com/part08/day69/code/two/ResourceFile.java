package com.part08.day69.code.two;

import com.part08.day68.code.two.Vistor;

/**
 * @author aserendipper
 * @date 2023/9/6
 * @desc
 */
public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract ResourceFileType getType();
}
