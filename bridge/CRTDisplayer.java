package com.example.design.bridge;

/**
 * @author: chenmingyu
 * @date: 2019/3/11 17:28
 * @description: CRT显示器
 */
public class CRTDisplayer extends AbstractDisplayer {

    @Override
    public void run() {
        System.out.println("运行 CRT显示器");
    }
}
