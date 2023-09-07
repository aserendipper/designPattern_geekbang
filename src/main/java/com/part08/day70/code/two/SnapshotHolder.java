package com.part08.day70.code.two;

import com.part08.day70.code.one.InputText;
import java.util.Stack;

/**
 * @author aserendipper
 * @date 2023/9/7
 * @desc
 */
public class SnapshotHolder {
    private Stack<Snapshot> snapshots = new Stack<>();
    
    public Snapshot popSnapshot() {
        return snapshots.pop();
    }
    
    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
