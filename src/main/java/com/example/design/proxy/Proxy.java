package com.example.design.proxy;

/**
 * @author: chenmingyu
 * @date: 2019/3/1 14:16
 * @description: 代理类
 */
public class Proxy implements Phoneable {

    private Phone phone = new Phone();

    @Override
    public void call() {
        if(validate()){
            phone.call();
        }
        System.out.println("结束通话");
    }

    /**
     * 检查手机号
     * @return
     */
    private Boolean validate(){
        System.out.println("手机号验证通过");
        return Boolean.TRUE;
    }
}
