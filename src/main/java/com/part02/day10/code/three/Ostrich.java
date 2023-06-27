package com.part02.day10.code.three;

import com.part02.day10.code.two.EggLayable;
import com.part02.day10.code.two.Tweetable;

/**
 * @author aserendipper
 * @date 2023/6/26
 * @desc 鸵鸟
 */
public class Ostrich implements Tweetable, EggLayable {
    /**
     * 组合
     */
    private TweetAbility tweetAbility = new TweetAbility();
    /**
     * 组合
     */
    private EggLayAbility eggLayAbility = new EggLayAbility();

    @Override
    public void layEgg() {
        //委托
        tweetAbility.tweet();
    }

    @Override
    public void tweet() {
        //委托
        eggLayAbility.layEgg();
    }
}
