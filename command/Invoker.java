package com.example.design.command;

import lombok.Data;

/**
 * @author: chenmingyu
 * @date: 2019/3/25 10:51
 * @description: 调用者
 */
@Data
public class Invoker {

    /**
     * 持有Commandable的实现类的实例
     */
    private Commandable commandable;

    /**
     * 执行命令
     */
    public void action(){
        this.commandable.execute();
    }
}
