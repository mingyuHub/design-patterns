package com.example.design.builder;

/**
 * @author: chenmingyu
 * @date: 2019/3/4 17:14
 * @description: 具体的建造者
 */
public class ConcreteBuilder extends Builder {

    private Computer computer = new Computer();

    @Override
    public void builderCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void builderMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public void builderDisk(String disk) {
        computer.setDisk(disk);
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
