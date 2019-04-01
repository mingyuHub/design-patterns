package com.example.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenmingyu
 * @date: 2019/4/1 18:05
 * @description:
 */
public class FlyweightFactory {

    private static final Map<String,ConcreteFlyweight> FLYWEIGHTMAP = new HashMap<>(16);

    /**
     * 获取ConcreteFlyweight
     * @param s
     * @return
     */
    public static Flyweight getFlyweight(String s){
        ConcreteFlyweight flyweight = FLYWEIGHTMAP.get(s);
        if(null == flyweight){
            flyweight = new ConcreteFlyweight(s);
            FLYWEIGHTMAP.put(s,flyweight);
        }
        return flyweight;
    }

    /**
     * 获取FLYWEIGHTMAP数量
     * @return
     */
    public static int getFlyweightSize() {
        return FLYWEIGHTMAP.size();
    }
}
