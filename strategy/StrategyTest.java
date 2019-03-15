package com.example.design.strategy;

/**
 * @author: chenmingyu
 * @date: 2019/2/21 18:25
 * @description:
 */
public class StrategyTest {

    public static void main(String[] args) {

        TripContext tripContext = new TripContext(new BicycleTripStrategy());
        tripContext.chooseTripMode();
        System.out.println("换一种出行方案");
        tripContext = new TripContext(new CarTripStraregy());
        tripContext.chooseTripMode();
    }
}
