package com.example.design.visitor;

/**
 * @author: chenmingyu
 * @date: 2019/3/26 20:52
 * @description:
 */
public interface Element {

    /**
     * 接受访问者
     * @param visitor
     */
    void accept(Visitorable visitor);

    /**
     * 自定义方法
     */
    void doSomething();
}
