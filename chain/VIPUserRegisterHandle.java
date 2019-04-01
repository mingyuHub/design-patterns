package com.example.design.chain;

/**
 * @author: chenmingyu
 * @date: 2019/3/23 11:02
 * @description: vip会员注册
 */
public class VIPUserRegisterHandle extends AbstractHandle {

    /**
     * VIP会员
     */
    public Integer VIPLevel = 2;

    @Override
    public String operator(String userName) {
        System.out.println("VIP会员注册："+userName);
        return userName;
    }

    @Override
    protected Integer getUserLevel() {
        return VIPLevel;
    }
}
