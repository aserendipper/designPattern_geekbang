package com.part08.day68.code.one;

/**
 * @author aserendipper
 * @date 2023/9/3
 * @desc
 */
public class PdfFile extends ResourceFile {

    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        //...
        System.out.println("Extract PDF.");
    }
}
