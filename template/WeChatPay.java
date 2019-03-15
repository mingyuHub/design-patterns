package com.example.design.template;

/**
 * @auther: chenmingyu
 * @date: 2019/2/13 17:20
 * @description: 微信支付
 */
public class WeChatPay extends AbstractPay{

    @Override
    String getPayInfo() {
        return "我的微信支付信息";
    }

    @Override
    void executePay() {
        System.out.println("微信支付了");
    }

    @Override
    void payMessage() {
        System.out.println("微信方式支付，微信内发服务通知");
    }
}
