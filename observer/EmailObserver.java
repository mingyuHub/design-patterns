package com.example.design.observer;

/**
 * @author: chenmingyu
 * @date: 2019/3/15 13:54
 * @description: 邮件观察者
 */
public class EmailObserver implements Observerable{

    @Override
    public void update(Object object) {
        if(null == object){
            return;
        }
        System.out.println("邮件观察者");
        System.out.println("邮件发送提醒：密码更改为："+object.toString());
    }
}
