package com.part08.day68.code.two;

/**
 * @author aserendipper
 * @date 2023/9/3
 * @desc
 */
public interface Vistor {
    void visit(PdfFile pdfFile);
    void visit(PPTFile pptFile);
    void visit(WordFile wordFile);
}
