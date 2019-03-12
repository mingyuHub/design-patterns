package com.example.design.abstract_factory.domain;

/**
 * @author: chenmingyu
 * @date: 2019/2/15 17:18
 * @description: 任天堂塔防游戏
 */
public class NintendoTowerDefenceGame extends TowerDefenceGame{

    @Override
    public void getGameType() {
        System.out.println("任天堂塔防游戏");
    }
}
