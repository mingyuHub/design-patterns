package com.example.design.observer;

/**
 * @author: chenmingyu
 * @date: 2019/3/15 13:44
 * @description: 被观察者接口
 */
public interface Subjectable {

    /**
     * 增加观察者
     */
    void addObserver(Observerable observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observerable observer);

    /**
     * 通知观察者
     */
    void notifyObserver(Object object);
}
