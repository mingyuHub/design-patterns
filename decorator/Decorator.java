package com.example.design.decorator;

/**
 * @author: chenmingyu
 * @date: 2019/3/1 10:26
 * @description: 装饰类
 */
public class Decorator implements Phoneable{

   private Phone phone;

   public Decorator(Phone phone) {
       this.phone = phone;
   }

    @Override
    public void call() {
        System.out.println("装饰器模式 前置功能：打电话先拨号");
        phone.call();
        System.out.println("装饰器模式 后置功能：挂断电话");
    }
}
