package com.example.design.factory;

/**
 * @auther: chenmingyu
 * @date: 2019/2/14 15:15
 * @description: 塔防类游戏工厂
 */
public class TowerDefenceGameFactory implements GameFactory{

    @Override
    public Gameable creator() {
        return new TowerDefenceGame();
    }
}
