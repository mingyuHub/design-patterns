package com.example.design.memento;

import lombok.Data;

/**
 * @author: chenmingyu
 * @date: 2019/3/25 20:42
 * @description: 原始对象
 */
@Data
public class Originator{

    private String name;

    /**
     * 创建备忘录
     * @return
     * @throws CloneNotSupportedException
     */
    public Memento createMemento(){
        return new Memento(this.getName());
    }

    /**
     * 恢复一个备忘录
     * @param memento
     */
    public void restoreMemento(Memento memento){
        this.setName(memento.getName());
    }

    public Originator(String name) {
        this.name = name;
    }
}
