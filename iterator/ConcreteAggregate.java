package com.example.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenmingyu
 * @date: 2019/3/18 11:16
 * @description:
 */
public class ConcreteAggregate implements  Aggregate {

    private List<String> list = new ArrayList<>();

    @Override
    public void add(String s) {
        list.add(s);
    }

    @Override
    public void remove(String s) {
        list.remove(s);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(list);
    }
}
