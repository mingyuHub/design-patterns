package com.example.design.iterator;

/**
 * @author: chenmingyu
 * @date: 2019/3/17 19:07
 * @description:
 */
public interface Iterator {

    /**
     * 返回下一个元素
     * @return
     */
    public Object next();

    /**
     * 是否已经遍历到尾部
     * @return
     */
    public boolean hasNext();

}
