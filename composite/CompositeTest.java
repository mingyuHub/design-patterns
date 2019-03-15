package com.example.design.composite;

/**
 * @author: chenmingyu
 * @date: 2019/3/12 17:50
 * @description:
 */
public class CompositeTest {

    public static void main(String[] args) {
        Employee lb = new Employee("刘备","老板");
        Employee gy = new Employee("关羽","组长");
        Employee zf = new Employee("张飞","组长");
        Employee sb1 = new Employee("士兵1","小兵");
        Employee sb2 = new Employee("士兵2","小兵");
        lb.add(gy);
        lb.add(zf);
        gy.add(sb1);
        zf.add(sb2);
        lb.getPeopleList().forEach(item ->{
            System.out.println(item);
        });
    }
}
