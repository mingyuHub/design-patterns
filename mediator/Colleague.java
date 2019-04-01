package com.example.design.mediator;

/**
 * @author: chenmingyu
 * @date: 2019/3/31 13:51
 * @description: 抽象对象类
 */
public abstract class Colleague {

    /**
     * 依赖中介者类
     */
    protected Mediatorable mediatorable;

    public Colleague(Mediatorable mediatorable) {
        this.mediatorable = mediatorable;
    }

    /**
     * 玩游戏
     */
    public abstract void playGame();
}
