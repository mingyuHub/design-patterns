package com.example.design.abstract_factory.domain;

/**
 * @author: chenmingyu
 * @date: 2019/2/15 16:57
 * @description: 任天堂射击游戏
 */
public class NintendoShootGame extends ShootGame{

    @Override
    public void getGameType() {
        System.out.println("任天堂射击游戏");
    }
}
