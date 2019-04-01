package com.example.design.iterator;

import java.util.List;

/**
 * @author: chenmingyu
 * @date: 2019/3/18 09:50
 * @description:
 */
public class ConcreteIterator implements Iterator {

    /**
     * 当前位置
     */
    public int cursor = 0;

    /**
     * 容器
     */
    private List<String> list;

    public ConcreteIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return this.list.get(this.cursor++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if(this.cursor == this.list.size()){
            return false;
        }else{
            return true;
        }
    }
}
