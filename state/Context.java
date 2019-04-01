package com.example.design.state;

import lombok.Data;

/**
 * @author: chenmingyu
 * @date: 2019/3/26 19:45
 * @description: 环境类
 */
@Data
public class Context {
    /**
     * 持有具体状态实例
     */
    private Stateable stateable;
}
