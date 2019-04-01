package com.example.design.mediator;

/**
 * @author: chenmingyu
 * @date: 2019/3/31 14:00
 * @description:
 */
public class MediatorTest {

    public static void main(String[] args) {
        Mediatorable mediatorable = new ConcreteMediator();
        mediatorable.createMediator();
        mediatorable.playGame();
    }
}
