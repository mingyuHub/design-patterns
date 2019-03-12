package com.example.design.decorator;

/**
 * @author: chenmingyu
 * @date: 2019/3/1 10:19
 * @description: 被装饰类
 */
public class Phone implements Phoneable{

    @Override
    public void call() {
        System.out.println("打电话");
    }
}
