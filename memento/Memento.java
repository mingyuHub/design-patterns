package com.example.design.memento;

import lombok.Data;

/**
 * @author: chenmingyu
 * @date: 2019/3/25 20:47
 * @description: 备忘录
 */
@Data
public class Memento {

    private String name;

    public Memento(String name) {
        this.name = name;
    }
}
