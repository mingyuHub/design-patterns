package com.example.design.chain;

import lombok.Data;

/**
 * @author: chenmingyu
 * @date: 2019/3/23 10:42
 * @description: 抽象类
 */
@Data
public abstract class AbstractHandle implements Handler {

    /**
     * 下一个处理器
     */
    public Handler nextHandler;

    /**
     * 获取用户等级
     * @return
     */
    protected abstract Integer getUserLevel();

    @Override
    public final String handleMessage(Integer level,String userName){
        String result = "";
        if(this.getUserLevel().equals(level)){
            result = this.operator(userName);
        }else{
            result = this.nextHandler.handleMessage(level,userName);
        }
        return result;
    }
}
