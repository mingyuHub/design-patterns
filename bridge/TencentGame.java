package com.example.design.bridge;

/**
 * @author: chenmingyu
 * @date: 2019/3/11 17:21
 * @description:
 */
public class TencentGame extends AbstractGame {

    @Override
    public void play() {
        System.out.println("启动腾讯游戏");
        displayer.run();
    }
}
