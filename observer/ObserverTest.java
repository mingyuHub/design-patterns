package com.example.design.observer;

/**
 * @author: chenmingyu
 * @date: 2019/3/15 13:57
 * @description:
 */
public class ObserverTest {

    public static void main(String[] args) {

        UserInfo userInfo = new UserInfo("麻辣香锅","malaxiangguo");

        SmsObserver smsObserver = new SmsObserver();
        EmailObserver emailObserver = new EmailObserver();

        userInfo.addObserver(smsObserver);
        userInfo.addObserver(emailObserver);

        userInfo.updatePassword("mlxg");
    }
}
