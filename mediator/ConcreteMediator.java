package com.example.design.mediator;

/**
 * @author: chenmingyu
 * @date: 2019/3/31 13:47
 * @description: 具体中介者
 */
public class ConcreteMediator implements Mediatorable {

    /**
     * 对象类1
     */
    private Colleague1 colleague1;
    /**
     * 对象类2
     */
    private Colleague2 colleague2;

    @Override
    public void createMediator() {
        colleague1 = new Colleague1(this);
        colleague2 = new Colleague2(this);
    }

    @Override
    public void playGame() {
        colleague1.playGame();
        colleague2.playGame();
    }
}
