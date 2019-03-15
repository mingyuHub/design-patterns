package com.example.design.factory;

/**
 * @auther: chenmingyu
 * @date: 2019/2/14 15:14
 * @description: 射击类游戏工厂
 */
public class ShootGameFactory implements GameFactory{

    @Override
    public Gameable creator() {
        return new ShootGame();
    }
}
