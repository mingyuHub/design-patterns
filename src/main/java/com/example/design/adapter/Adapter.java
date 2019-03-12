package com.example.design.adapter;

/**
 * @author: chenmingyu
 * @date: 2019/2/18 19:20
 * @description: 适配器
 */
public class Adapter implements Target {

    /**
     * 被适配类
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.adapterMethod();
    }
}
