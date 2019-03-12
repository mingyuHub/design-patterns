package com.example.design.abstract_factory.domain;

/**
 * @author: chenmingyu
 * @date: 2019/2/14 11:19
 * @description: 游戏接口
 */
public interface Gameable {

    /**
     * 校验账户信息
     * @param nickName
     */
    void validateAccount(String nickName);


    /**
     * 游戏类型
     */
    void getGameType();
}
