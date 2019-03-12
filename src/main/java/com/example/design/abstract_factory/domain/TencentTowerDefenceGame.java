package com.example.design.abstract_factory.domain;

/**
 * @author: chenmingyu
 * @date: 2019/2/15 17:17
 * @description: 腾讯塔防游戏
 */
public class TencentTowerDefenceGame extends TowerDefenceGame{

    @Override
    public void getGameType() {
        System.out.println("腾讯塔防游戏");
    }
}
