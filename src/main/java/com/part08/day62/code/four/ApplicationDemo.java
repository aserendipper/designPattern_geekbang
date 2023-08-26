package com.part08.day62.code.four;

/**
 * @author aserendipper
 * @date 2023/8/26
 * @desc
 */
public class ApplicationDemo {

    public static void main(String[] args) {
        SensitiveWordFilterChain chain = new SensitiveWordFilterChain();
        chain.addFilter(new SexyWordFilter());
        chain.addFilter(new PoliticalWordFilter());
        chain.filter(new Content());
    }
}
