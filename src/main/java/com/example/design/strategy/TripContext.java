package com.example.design.strategy;

/**
 * @author: chenmingyu
 * @date: 2019/2/21 18:22
 * @description:
 */
public class TripContext {

    /**
     * 出行策略
     */
    private TripStrategy tripStrategy;

    public TripContext(TripStrategy tripStrategy) {
        this.tripStrategy = tripStrategy;
    }

    /**
     * 选择出行策略
     */
    public void chooseTripMode(){
        this.tripStrategy.tripMode();
    }
}
