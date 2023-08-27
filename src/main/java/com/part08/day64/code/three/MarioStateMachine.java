package com.part08.day64.code.three;

/**
 * @author aserendipper
 * @date 2023/8/27
 * @desc
 */
public class MarioStateMachine {
    private int score;
    private IMario currentState;
    
    public MarioStateMachine() {
        this.score = 0;
        this.currentState = new SmallMario();
    }
    
    public void obtainMushRoom() {
        currentState.obtainMushRoom(this);
    }
    
    public void obtainCape() {
        currentState.obtainCape(this);
    }
    
    public void obtainFireFlower() {
        currentState.obtainFireFlower(this);
    }
    
    public void meetMonster() {
        currentState.meetMonster(this);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public IMario getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }
}
