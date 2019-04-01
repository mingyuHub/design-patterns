package com.example.design.mediator;

/**
 * @author: chenmingyu
 * @date: 2019/3/31 13:46
 * @description: 抽象中介者
 */
public interface Mediatorable {

    /**
     * 创建中介者
     */
    void createMediator();

    /**
     * 打游戏
     */
    void playGame();
}
