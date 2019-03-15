package com.example.design.observer;

/**
 * @author: chenmingyu
 * @date: 2019/3/15 13:40
 * @description: 观察者
 */
public interface Observerable {

    /**
     * 被观察者变化触发事件
     */
    void update(Object object);
}
