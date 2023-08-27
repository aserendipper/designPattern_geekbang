package com.part08.day64.code.three;

import com.part08.day64.code.one.State;

/**
 * @author aserendipper
 * @date 2023/8/27
 * @desc
 */
public interface IMario {
    State getName();

    void obtainMushRoom(MarioStateMachine stateMachine);

    void obtainCape(MarioStateMachine stateMachine);

    void obtainFireFlower(MarioStateMachine stateMachine);

    void meetMonster(MarioStateMachine stateMachine);
}
