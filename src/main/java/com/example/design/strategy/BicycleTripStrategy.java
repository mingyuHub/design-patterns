package com.example.design.strategy;

/**
 * @author: chenmingyu
 * @date: 2019/2/21 18:19
 * @description: 自行车出行策略类
 */
public class BicycleTripStrategy implements TripStrategy{

    @Override
    public void tripMode() {
        System.out.println("选择骑自行车出行");
    }
}
