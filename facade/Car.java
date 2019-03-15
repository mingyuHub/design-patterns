package com.example.design.facade;

/**
 * @author: chenmingyu
 * @date: 2019/3/1 14:57
 * @description:
 */
public class Car {

    /**
     * 发动机
     */
    private Engine engine;
    /**
     * 仪表盘
     */
    private Armaturenbrett armaturenbrett;
    /**
     * 大灯
     */
    private Headlight headlight;

    public Car() {
        this.engine = new Engine();
        this.armaturenbrett = new Armaturenbrett();
        this.headlight = new Headlight();
    }

    public void start(){
        System.out.println("启动汽车...");
        engine.start();
        armaturenbrett.start();
        headlight.start();
        System.out.println("汽车以启动...");
    }
}
