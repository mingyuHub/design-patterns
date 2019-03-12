package com.example.design.abstract_factory;

import com.example.design.abstract_factory.factory.NintendoGameFactory;
import com.example.design.abstract_factory.factory.TencentGameFactory;

/**
 * @auther: chenmingyu
 * @date: 2019/2/14 11:38
 * @description:
 */
public class FactoryTest {

    public static void main(String[] args) throws Exception{

        NintendoGameFactory nintendoGameFactory = new NintendoGameFactory();
        nintendoGameFactory.createShootGame().getGameType();
        nintendoGameFactory.createTowerDefenceGame().getGameType();

        TencentGameFactory tencentGameFactory = new TencentGameFactory();
        tencentGameFactory.createShootGame().getGameType();
        tencentGameFactory.createTowerDefenceGame().getGameType();
    }
}
