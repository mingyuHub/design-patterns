package com.example.design.strategy;

/**
 * @author: chenmingyu
 * @date: 2019/2/21 18:21
 * @description: 开车出行策略类
 */
public class CarTripStraregy implements TripStrategy {

    @Override
    public void tripMode() {
        System.out.println("选择开车出行");
    }
}
