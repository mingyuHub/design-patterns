package com.example.design.factory;

/**
 * @auther: chenmingyu
 * @date: 2019/2/14 11:38
 * @description:
 */
public class FactoryTest {

    public static void main(String[] args) {

        GameFactory shootGameFactory = new ShootGameFactory();
        Gameable shootGame = shootGameFactory.creator();
        shootGame.validateAccount("明羽");
        System.out.println("... 分割线 ...");
        GameFactory towerDefenceGameFactory = new TowerDefenceGameFactory();
        Gameable towerDefenceGame = towerDefenceGameFactory.creator();
        towerDefenceGame.validateAccount("明羽");
    }
}
