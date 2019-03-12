package com.example.design.adapter;

/**
 * @author: chenmingyu
 * @date: 2019/2/18 19:26
 * @description:
 */
public class AdapterTest {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.request();
    }
}
