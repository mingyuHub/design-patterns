package com.example.design.factory;

import org.springframework.util.StringUtils;

/**
 * @auther: chenmingyu
 * @date: 2019/2/14 11:29
 * @description: 工厂类
 */
public interface GameFactory {

    /**
     * 根据传入类型生成实例
     * @return
     */
    Gameable creator();


    /*public static Gameable creator(String gameType){
        Gameable gameable = null;
        if(StringUtils.isEmpty(gameType)){
            return gameable;
        }
        if("shoot".equalsIgnoreCase(gameType)){
            gameable = new ShootGame();
        }else if("towerDefence".equalsIgnoreCase(gameType)){
            gameable = new TowerDefenceGame();
        }
        return gameable;
    }*/
}
