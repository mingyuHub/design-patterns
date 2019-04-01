package com.example.design.mediator;

/**
 * @author: chenmingyu
 * @date: 2019/3/31 13:56
 * @description:
 */
public class Colleague2 extends Colleague {

    public Colleague2(Mediatorable mediatorable) {
        super(mediatorable);
    }

    @Override
    public void playGame() {
        System.out.println("Colleague2 玩游戏");
    }
}
