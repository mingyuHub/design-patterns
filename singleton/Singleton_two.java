package com.example.design.singleton;

/**
 * @auther: chenmingyu
 * @date: 2019/2/12 16:32
 * @description:
 */
public class Singleton_two {

    private static volatile Singleton_two singleton;

    private Singleton_two() {
    }

    public static Singleton_two getInstance(){
        if(null == singleton){
            synchronized (Singleton_two.class){
                if(null == singleton){
                    singleton = new Singleton_two();
                }
            }
        }
        return singleton;
    }
}
