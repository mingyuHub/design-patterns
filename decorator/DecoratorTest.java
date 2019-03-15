package com.example.design.decorator;

/**
 * @author: chenmingyu
 * @date: 2019/3/1 10:32
 * @description:
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Decorator decorator = new Decorator(new Phone());
        decorator.call();
    }
}
