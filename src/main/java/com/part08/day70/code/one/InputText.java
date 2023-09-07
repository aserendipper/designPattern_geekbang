package com.part08.day70.code.one;

/**
 * @author aserendipper
 * @date 2023/9/7
 * @desc
 */
public class InputText {
    private StringBuilder text = new StringBuilder();
    
    public String getText() {
        return text.toString();
    }
    
    public void append(String input) {
        text.append(input);
    }
    
    public void setText(String text) {
        this.text.replace(0, this.text.length(), text);
    }
}
