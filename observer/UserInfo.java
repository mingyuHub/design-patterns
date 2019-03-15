package com.example.design.observer;

import lombok.Data;

/**
 * @author: chenmingyu
 * @date: 2019/3/15 13:50
 * @description: 被观察者
 */
@Data
public class UserInfo extends AbstractSubject{

    /**
     * 昵称
     */
    private String nickName;
    /**
     * 密码
     */
    private String password;

    /**
     * 修改密码
     * @param password
     */
    public void updatePassword(String password){
        this.password = password;
        this.notifyObserver(password);
    }

    public UserInfo(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }
}
