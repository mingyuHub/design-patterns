package com.example.design.command;

/**
 * @author: chenmingyu
 * @date: 2019/3/25 10:54
 * @description: 学习命令
 */
public class StudyCommand implements Commandable {

    private Receive receive;

    public StudyCommand(Receive receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        this.receive.study();
    }
}
