package com.example.design.bridge;

/**
 * @author: chenmingyu
 * @date: 2019/3/11 17:17
 * @description: 任天堂游戏
 */
public class NintendoGame extends AbstractGame{

    @Override
    public void play() {
        System.out.println("启动任天堂游戏");
        displayer.run();
    }
}
