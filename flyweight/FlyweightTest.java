package com.example.design.flyweight;

/**
 * @author: chenmingyu
 * @date: 2019/4/1 18:14
 * @description:
 */
public class FlyweightTest {

    public static void main(String[] args) {
        Flyweight javaFlyweight = FlyweightFactory.getFlyweight("java");
        javaFlyweight.study("a");
        Flyweight goFlyweight = FlyweightFactory.getFlyweight("go");
        goFlyweight.study("b");
        Flyweight javaFlyweight1 = FlyweightFactory.getFlyweight("java");
        javaFlyweight1.study("c");
        System.out.println(javaFlyweight == javaFlyweight1);
        System.out.println("Flyweight 总数："+FlyweightFactory.getFlyweightSize());
    }
}
