package com.example.design.proxy;

/**
 * @author: chenmingyu
 * @date: 2019/3/1 10:19
 * @description: 被代理类
 */
public class Phone implements Phoneable {

    @Override
    public void call() {
        System.out.println("打电话");
    }
}
