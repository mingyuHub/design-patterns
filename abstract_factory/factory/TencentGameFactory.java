package com.example.design.abstract_factory.factory;

import com.example.design.abstract_factory.domain.*;

/**
 * @author: chenmingyu
 * @date: 2019/2/14 18:20
 * @description: 腾讯游戏制造厂
 */
public class TencentGameFactory implements GameFactory {

    @Override
    public Gameable createShootGame() {
        return new TencentShootGame();
    }

    @Override
    public Gameable createTowerDefenceGame() {
        return new TencentTowerDefenceGame();
    }
}
