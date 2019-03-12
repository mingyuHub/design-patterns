package com.example.design.builder;

/**
 * @author: chenmingyu
 * @date: 2019/3/4 17:05
 * @description: 抽象建造者
 */
public abstract class Builder {

    /**
     * 组装cpu
     */
    public abstract void builderCpu(String cpu);

    /**
     * 组装内存
     */
    public abstract void builderMemory(String memory);

    /**
     * 组装硬盘
     */
    public abstract void builderDisk(String disk);

    /**
     * 获取电脑
     * @return
     */
    public abstract Computer getComputer();

}
