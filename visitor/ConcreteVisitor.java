package com.example.design.visitor;

/**
 * @author: chenmingyu
 * @date: 2019/3/26 20:54
 * @description: 具体访问者
 */
public class ConcreteVisitor implements Visitorable {

    @Override
    public void visit(Element sub) {
        sub.doSomething();
        System.out.println("访问者学习设计模式");
    }
}
