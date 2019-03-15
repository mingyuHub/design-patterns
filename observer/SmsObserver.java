package com.example.design.observer;

/**
 * @author: chenmingyu
 * @date: 2019/3/15 13:56
 * @description: 短信观察者
 */
public class SmsObserver implements Observerable {

    @Override
    public void update(Object object) {
        if(null == object){
            return;
        }
        System.out.println("短信观察者");
        System.out.println("短信发送提醒：密码更改为："+object.toString());
    }
}
