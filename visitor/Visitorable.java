package com.example.design.visitor;

/**
 * @author: chenmingyu
 * @date: 2019/3/26 20:52
 * @description: 抽象访问者
 */
public interface Visitorable {

    /**
     * 接收元素
     * @param sub
     */
    void visit(Element sub);
}
