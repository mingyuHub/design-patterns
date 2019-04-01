package com.example.design.state;

/**
 * @author: chenmingyu
 * @date: 2019/3/26 19:44
 * @description:
 */
public class StudyState implements Stateable{

    @Override
    public void doSometing() {
        System.out.println("学习状态，就要学习");
    }
}
