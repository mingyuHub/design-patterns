package com.example.design.command;

/**
 * @author: chenmingyu
 * @date: 2019/3/25 10:56
 * @description:
 */
public class CommandTest {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Receive receive = new Receive();

        Commandable gameCommand = new GameCommand(receive);
        invoker.setCommandable(gameCommand);
        invoker.action();

        Commandable studyCommand = new StudyCommand(receive);
        invoker.setCommandable(studyCommand);
        invoker.action();
    }
}
