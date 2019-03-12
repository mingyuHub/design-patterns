package com.example.design.factory;

/**
 * @auther: chenmingyu
 * @date: 2019/2/14 11:28
 * @description: 塔防类游戏
 */
public class TowerDefenceGame implements Gameable{

    @Override
    public void validateAccount(String nickName) {
        System.out.println("塔防游戏校验昵称："+nickName);
    }
}
