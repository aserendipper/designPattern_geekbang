package com.part08.day64.code.one;

/**
 * @author aserendipper
 * @date 2023/8/27
 * @desc
 */
public class ApplicationDemo {

    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
