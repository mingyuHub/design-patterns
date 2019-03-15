package com.example.design.template;

/**
 * @auther: chenmingyu
 * @date: 2019/2/13 17:22
 * @description:
 */
public class TemplateTest {

    public static void main(String[] args) {
        BankCardPay bankCardPay = new BankCardPay();
        bankCardPay.pay();
        System.out.println("... 分割线 ...");
        WeChatPay weChatPay = new WeChatPay();
        weChatPay.pay();
    }
}
