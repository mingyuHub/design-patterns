package com.example.design.chain;

import lombok.Data;

/**
 * @author: chenmingyu
 * @date: 2019/3/23 10:46
 * @description: 普通用户注册
 */
@Data
public class UserRegisterHandle extends AbstractHandle {

    /**
     * 普通会员
     */
    public Integer ordinaryLevel = 1;

    @Override
    public String operator(String userName) {
        System.out.println("普通会员注册："+userName);
        return userName;
    }

    @Override
    protected Integer getUserLevel() {
        return ordinaryLevel;
    }
}
