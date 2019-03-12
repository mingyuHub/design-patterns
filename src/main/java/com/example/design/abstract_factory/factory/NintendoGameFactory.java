package com.example.design.abstract_factory.factory;

import com.example.design.abstract_factory.domain.*;

/**
 * @author: chenmingyu
 * @date: 2019/2/14 18:20
 * @description: 任天堂游戏制造厂
 */
public class NintendoGameFactory implements GameFactory{

    @Override
    public Gameable createShootGame() {
        return new NintendoShootGame();
    }

    @Override
    public Gameable createTowerDefenceGame() {
        return new NintendoTowerDefenceGame();
    }
}
