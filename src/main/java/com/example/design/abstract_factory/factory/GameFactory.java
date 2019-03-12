package com.example.design.abstract_factory.factory;


import com.example.design.abstract_factory.domain.Gameable;
import com.example.design.abstract_factory.domain.ShootGame;
import com.example.design.abstract_factory.domain.TowerDefenceGame;

/**
 * @author: chenmingyu
 * @date: 2019/2/14 11:29
 * @description: 工厂类
 */
public interface GameFactory {

    /**
     * 创建射击游戏
     * @return
     */
    Gameable createShootGame();

    /**
     * 创建塔防游戏
     * @return
     */
    Gameable createTowerDefenceGame();

}
