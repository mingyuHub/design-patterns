package com.example.design.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenmingyu
 * @date: 2019/3/12 17:46
 * @description:
 */
@Data
public class Menu {

    /**
     * 菜单名
     */
    private String name;

    /**
     * 路径
     */
    private String path;

    private List<Menu> menus;

    public Menu(String name, String path) {
        this.name = name;
        this.path = path;
        menus = new ArrayList<>();
    }

    public void add(Menu menu){
        menus.add(menu);
    }

    public void remove(Menu menu){
        menus.remove(menu);
    }
}
