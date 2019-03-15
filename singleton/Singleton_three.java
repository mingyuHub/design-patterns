package com.example.design.singleton;

/**
 * @auther: chenmingyu
 * @date: 2019/2/12 17:03
 * @description:
 */
public class Singleton_three {

    private Singleton_three() {
    }

    public static Singleton_three getInstance(){
        return SingletonHolder.SINGLETON;
    }

    private static class SingletonHolder{
        private static final Singleton_three SINGLETON = new Singleton_three();
    }

    public void sys(){
        System.out.println("静态内部类实现");
    }

    public static void main(String[] args) {
        Singleton_three.getInstance().sys();
        Singleton.SINGLETON.method();
    }
}
