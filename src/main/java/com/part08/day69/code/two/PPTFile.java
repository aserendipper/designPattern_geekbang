package com.part08.day69.code.two;

/**
 * @author aserendipper
 * @date 2023/9/6
 * @desc
 */
public class PPTFile extends ResourceFile {

    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public ResourceFileType getType() {
        return ResourceFileType.PPT;
    }
}
