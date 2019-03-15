package com.example.design.abstract_factory.domain;

/**
 * @author: chenmingyu
 * @date: 2019/2/15 16:55
 * @description: 腾讯射击游戏
 */
public class TencentShootGame extends ShootGame {

    @Override
    public void getGameType() {
        System.out.println("腾讯射击游戏");
    }
}
