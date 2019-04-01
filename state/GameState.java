package com.example.design.state;

/**
 * @author: chenmingyu
 * @date: 2019/3/26 19:43
 * @description: 游戏状态
 */
public class GameState implements Stateable {

    @Override
    public void doSometing() {
        System.out.println("游戏状态，就打游戏");
    }
}
