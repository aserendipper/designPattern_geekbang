package com.part04.day28.code.one;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class Text {
    private String content;

    public Text(String content) {
        this.content = content;
    }
    
    public Integer toNumber() {
        if (content == null || content.isEmpty()) {
            return null;
        }
        if (content.contains(" ")) {
            content = content.replaceAll(" ", "");
        }
        return Integer.valueOf(content);
    }
}
