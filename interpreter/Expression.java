package com.example.design.interpreter;

/**
 * @author: chenmingyu
 * @date: 2019/3/31 15:00
 * @description: 抽象解释器
 */
public interface Expression {

    /**
     * 定义解释器规则
     * @param context
     * @return
     */
    boolean interpret(String context);
}
