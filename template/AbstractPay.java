package com.example.design.template;

/**
 * @auther: chenmingyu
 * @date: 2019/2/13 16:58
 * @description: 定义支付流程
 */
public abstract class AbstractPay {

    /**
     * 获取支付信息
     */
    abstract String getPayInfo();

    /**
     * 执行支付
     */
    abstract void executePay();

    /**
     * 支付反馈信息
     */
    abstract void payMessage();

    /**
     * 支付
     */
    public final void pay(){
        String info = getPayInfo();
        System.out.println("支付账户:"+info);
        executePay();
        payMessage();
    }
}
