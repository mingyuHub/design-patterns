package com.example.design.interpreter;

/**
 * @author: chenmingyu
 * @date: 2019/3/31 15:08
 * @description:
 */
public class InterpreterTest {

    public static void main(String[] args) {
        Expression expression = new TerminalExpression("http");
        System.out.println("http://chenmingyu.top 是以http开头："+expression.interpret("http://chenmingyu.top"));
        System.out.println("www.chenmingyu.top 是以http开头："+expression.interpret("www.chenmingyu.top"));
    }
}
