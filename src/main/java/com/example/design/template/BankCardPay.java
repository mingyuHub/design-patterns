package com.example.design.template;

/**
 * @auther: chenmingyu
 * @date: 2019/2/13 17:18
 * @description: 银行卡支付
 */
public class BankCardPay extends AbstractPay{

    @Override
    String getPayInfo() {
        return "我的银行卡信息";
    }

    @Override
    void executePay() {
        System.out.println("银行卡支付了");
    }

    @Override
    void payMessage() {
        System.out.println("银行卡方式支付，发短息");
    }
}
