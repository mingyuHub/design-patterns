package com.example.design.adapter;

/**
 * @author: chenmingyu
 * @date: 2019/2/18 19:20
 * @description: 被适配类
 */
public class Adaptee {

    /**
     * 被适配的接口
     */
    public void adapterMethod(){
        System.out.println("我是要被适配的方法");
    };
}
