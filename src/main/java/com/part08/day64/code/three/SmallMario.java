package com.part08.day64.code.three;

import com.part08.day64.code.one.State;

/**
 * @author aserendipper
 * @date 2023/8/27
 * @desc
 */
public class SmallMario implements IMario {
    private static final SmallMario instance = new SmallMario();
    
    public SmallMario() {
        
    }
    
    public static SmallMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SuperMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(CapeMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(FireMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        // ...
    }
}
