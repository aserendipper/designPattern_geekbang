package com.part08.day68.code.two;

/**
 * @author aserendipper
 * @date 2023/9/3
 * @desc
 */
public class Compressor implements Vistor {

    @Override
    public void visit(PdfFile pdfFile) {
        // ...
        System.out.println("Compress PDF.");
    }

    @Override
    public void visit(PPTFile pptFile) {
        // ...
        System.out.println("Compress PPT.");
    }

    @Override
    public void visit(WordFile wordFile) {
        // ...
        System.out.println("Compress WORD.");
    }
}
