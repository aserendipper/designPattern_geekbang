package com.part08.day70.code.two;

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
    
    public Snapshot createSnapshot() {
        return new Snapshot(text.toString());
    }
    
    public void restoreSnapshot(Snapshot snapshot) {
        this.text.replace(0, this.text.length(), snapshot.getText());
    }
}
