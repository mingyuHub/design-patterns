package com.example.design.builder;

/**
 * @author: chenmingyu
 * @date: 2019/3/4 17:24
 * @description:
 */
public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();
        Computer computer = director.builderComputer("Intel cpu","内存","硬盘");
        System.out.println(computer);
    }
}
