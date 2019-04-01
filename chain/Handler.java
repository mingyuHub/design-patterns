package com.example.design.chain;

/**
 * @author: chenmingyu
 * @date: 2019/3/22 20:32
 * @description:
 */
public interface Handler {

    /**
     * 注册操作
     * @param userName 用户名
     */
    String operator(String userName);

    /**
     * 责任链调用处理
     *      如果可以自己处理则自己处理，如果处理不了，交由下一个处理类处理
     * @param level
     * @param userName
     * @return
     */
    String handleMessage(Integer level,String userName);
}
