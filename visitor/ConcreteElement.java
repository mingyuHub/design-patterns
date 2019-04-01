package com.example.design.visitor;

/**
 * @author: chenmingyu
 * @date: 2019/3/26 20:56
 * @description: 具体元素
 */
public class ConcreteElement implements Element {

    @Override
    public void accept(Visitorable visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("要不要学一会儿设计模式");
    }
}
