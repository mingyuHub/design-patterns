package com.example.design.mediator;

/**
 * @author: chenmingyu
 * @date: 2019/3/31 13:54
 * @description:
 */
public class Colleague1 extends Colleague {

    public Colleague1(Mediatorable mediatorable) {
        super(mediatorable);
    }

    @Override
    public void playGame() {
        System.out.println("Colleague1 玩游戏");
    }
}
