package com.part08.day68.code.two;

/**
 * @author aserendipper
 * @date 2023/9/3
 * @desc
 */
public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }

}
