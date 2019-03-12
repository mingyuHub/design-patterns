package com.example.design.bridge;

/**
 * @author: chenmingyu
 * @date: 2019/3/11 17:13
 * @description: 抽象游戏类
 */
public abstract class AbstractGame {

    protected AbstractDisplayer displayer;

    public void setAbstractDisplayer(AbstractDisplayer displayer) {
        this.displayer = displayer;
    }

    /**
     * 玩游戏
     */
    public abstract void play();
}
