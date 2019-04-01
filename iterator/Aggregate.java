package com.example.design.iterator;

/**
 * @auther: chenmingyu
 * @date: 2019/3/18 09:51
 * @description:
 */
public interface Aggregate {

    /**
     * 是容器必然有元素的增加
     * @param s
     */
    public void add(String s);

    /**
     * 减少元素
     * @param s
     */
    public void remove(String s);

    /**
     * 由迭代器来遍历所有的元素
     * @return
     */
    public Iterator createIterator();
}
