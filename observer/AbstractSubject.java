package com.example.design.observer;

import java.util.Vector;

/**
 * @author: chenmingyu
 * @date: 2019/3/15 11:24
 * @description: 被观察者抽象类
 */
public abstract class AbstractSubject implements Subjectable{

    /**
     * 观察者列表
     */
    private Vector<Observerable> observers = new Vector();

    @Override
    public void addObserver(Observerable observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observerable observer){
        observers.add(observer);
    }

    @Override
    public void notifyObserver(Object object){
        observers.forEach(observer->{
            observer.update(object);
        });
    }
}
