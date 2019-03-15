package com.example.design.prototype;

import lombok.Data;

/**
 * @author: chenmingyu
 * @date: 2019/2/28 09:54
 * @description: 抽象原型角色
 */
@Data
public abstract class Pen implements Cloneable{

    private String name;

    public Pen(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
