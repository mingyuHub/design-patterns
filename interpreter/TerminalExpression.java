package com.example.design.interpreter;

/**
 * @author: chenmingyu
 * @date: 2019/3/31 15:03
 * @description:
 */
public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.startsWith(data)){
            return true;
        }
        return false;
    }
}
