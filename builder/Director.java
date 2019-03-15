package com.example.design.builder;

/**
 * @author: chenmingyu
 * @date: 2019/3/4 17:10
 * @description: 主管
 */
public class Director {

    private Builder builder = new ConcreteBuilder();

    /**
     * 组装电脑
     */
    public Computer builderComputer(String cpu, String memory, String disk){
        builder.builderCpu(cpu);
        builder.builderMemory(memory);
        builder.builderDisk(disk);
        return builder.getComputer();
    }
}
