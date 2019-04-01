package com.example.design.chain;

/**
 * @author: chenmingyu
 * @date: 2019/3/23 11:04
 * @description:
 */
public class ChainTest {

    public static void main(String[] args) {

        UserRegisterHandle userRegisterHandle = new UserRegisterHandle();
        VIPUserRegisterHandle vipUserRegisterHandle = new VIPUserRegisterHandle();
        userRegisterHandle.setNextHandler(vipUserRegisterHandle);

        userRegisterHandle.handleMessage(2,"mingyu");
        userRegisterHandle.handleMessage(1,"mingyu");
    }
}
