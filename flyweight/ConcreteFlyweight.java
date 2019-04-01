package com.example.design.flyweight;

/**
 * @author: chenmingyu
 * @date: 2019/4/1 17:40
 * @description: 具体享元角色
 */
public class ConcreteFlyweight implements Flyweight {

    /**
     * 内部状态
     */
    private String interiorState;

    public ConcreteFlyweight(String interiorState) {
        this.interiorState = interiorState;
    }

    @Override
    public void study(String user) {
        System.out.println(user+"学习"+interiorState+"课程");
    }
}
