package com.example.design.memento;

import lombok.Data;

/**
 * @author: chenmingyu
 * @date: 2019/3/25 20:57
 * @description: 备忘录管理员
 */
@Data
public class Caretaker {

    private Memento memento;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }
}
