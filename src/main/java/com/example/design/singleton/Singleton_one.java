package com.example.design.singleton;

/**
 * @auther: chenmingyu
 * @date: 2019/2/12 16:26
 * @description:
 */
public class Singleton_one {

    private static Singleton_one singleton = new Singleton_one();

    private Singleton_one() {
    }

    public static Singleton_one getInstance(){
        return singleton;
    }
}
