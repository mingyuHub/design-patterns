package com.example.design.iterator;

/**
 * @author: chenmingyu
 * @date: 2019/3/18 11:24
 * @description:
 */
public class IteratorTest {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("first title");
        aggregate.add("second title");
        aggregate.add("third title");
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
