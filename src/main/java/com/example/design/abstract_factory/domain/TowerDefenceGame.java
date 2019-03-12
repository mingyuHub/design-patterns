package com.example.design.abstract_factory.domain;


/**
 * @author: chenmingyu
 * @date: 2019/2/14 11:28
 * @description: 塔防类游戏
 */
public abstract class TowerDefenceGame implements Gameable{

    @Override
    public void validateAccount(String nickName) {
        System.out.println("塔防游戏校验昵称："+nickName);
    }

}
