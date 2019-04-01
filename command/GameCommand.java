package com.example.design.command;

/**
 * @author: chenmingyu
 * @date: 2019/3/25 10:52
 * @description: 玩游戏命令
 */
public class GameCommand implements Commandable{

    private Receive receive;

    public GameCommand(Receive receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        this.receive.play();
    }
}
