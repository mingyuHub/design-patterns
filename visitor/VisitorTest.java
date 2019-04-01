package com.example.design.visitor;

/**
 * @author: chenmingyu
 * @date: 2019/3/26 21:00
 * @description:
 */
public class VisitorTest {

    public static void main(String[] args) {
        Visitorable visitor = new ConcreteVisitor();
        Element subject = new ConcreteElement();
        subject.accept(visitor);
    }
}
