package com.part08.day70.code.one;

import java.util.Stack;

/**
 * @author aserendipper
 * @date 2023/9/7
 * @desc
 */
public class SnapshotHolder {
    private Stack<InputText> snapshots = new Stack<>();
    
    public InputText popSnapshot() {
        return snapshots.pop();
    }
    
    public void pushSnapshot(InputText inputText) {
        InputText deepClonedInputText = new InputText();
        deepClonedInputText.setText(inputText.getText());
        snapshots.push(deepClonedInputText);
    }
}
