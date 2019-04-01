package com.example.design.memento;

/**
 * @author: chenmingyu
 * @date: 2019/3/25 20:59
 * @description:
 */
public class MementoTest {

    public static void main(String[] args) {
        Originator originator = new Originator("mingyu");
        Caretaker caretaker = new Caretaker(originator.createMemento());
        System.out.println(originator.getName());
        System.out.println("……");
        originator.setName("wuwu");
        System.out.println(originator.getName());
        System.out.println("……");
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getName());
    }
}
