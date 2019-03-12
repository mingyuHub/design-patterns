package com.example.design.bridge;

/**
 * @author: chenmingyu
 * @date: 2019/3/11 17:27
 * @description: LCD显示器
 */
public class LCDDisplay extends AbstractDisplayer{

    @Override
    public void run() {
        System.out.println("运行 LCD显示器");
    }
}
