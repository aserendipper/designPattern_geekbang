package com.part08.day64.code.one;

/**
 * @author aserendipper
 * @date 2023/8/27
 * @desc
 */
public class MarioStateMachine {
    private int score;
    private State currentState;
    
    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }
    
    public void obtainMushRoom() {
        if (currentState.equals(State.SMALL)) {
            score = score + 100;
            currentState = State.SUPER;
        }
    }
    
    public void obtainCape() {
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) {
            score = score + 200;
            currentState = State.CAPE;
        }
    }
    
    public void obtainFireFlower() {
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) {
            score = score + 300;
            currentState = State.FIRE;
        }
    }

    public void meetMonster() {
        if (currentState.equals(State.SUPER)) {
            score = score - 100;
            currentState = State.SMALL;
            return;
        }
        if (currentState.equals(State.CAPE)) {
            score = score - 200;
            currentState = State.SMALL;
            return;
        }
        if (currentState.equals(State.FIRE)) {
            score = score - 300;
            currentState = State.SMALL;
            return;
        }
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }
}
