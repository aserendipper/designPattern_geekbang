package com.part08.day64.code.three;

import com.part08.day64.code.one.State;

/**
 * @author aserendipper
 * @date 2023/8/27
 * @desc
 */
public class CapeMario implements IMario {
    private static final CapeMario instance = new CapeMario();
    
    private CapeMario() {
        
    }
    
    public static CapeMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return State.CAPE;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        // ...
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        // ...
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        // ...
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 200);
    }
}
