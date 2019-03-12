package com.example.design.prototype;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author: chenmingyu
 * @date: 2019/2/28 11:32
 * @description: 笔生产工厂
 */
public class PenFactory {

    /**
     * 原型类容器
     */
    private static Map<String, Pen> penMap = new Hashtable<>();

    /**
     * 初始化
     */
    public static void init() {
        Pen carbonPen = new CarbonPen("碳素笔");
        penMap.put(CarbonPen.class.getName(),carbonPen);
        Pen pencil = new Pencil("铅笔");
        penMap.put(Pencil.class.getName(),pencil);
    }

    /**
     * 通过复制获取实例
     * @param className
     * @return
     * @throws CloneNotSupportedException
     */
    public static Pen getPen(Class className) throws CloneNotSupportedException{
        Pen cachedShape = penMap.get(className.getName());
        return (Pen) cachedShape.clone();
    }

}
