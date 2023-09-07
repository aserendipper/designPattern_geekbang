package com.part08.day70.code.one;

import java.util.Scanner;
import jdk.internal.util.xml.impl.Input;

/**
 * @author aserendipper
 * @date 2023/9/7
 * @desc
 */
public class ApplicationMain {

    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals(":list")) {
                System.out.println(inputText.toString());
            } else if (input.equals(":undo")) {
                InputText snapshot = snapshotHolder.popSnapshot();
                inputText.setText(snapshot.getText());
            } else {
                snapshotHolder.pushSnapshot(inputText);
                inputText.append(input);
            }
        }
    }
}
