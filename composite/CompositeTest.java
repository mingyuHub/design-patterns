package com.example.design.composite;

/**
 * @author: chenmingyu
 * @date: 2019/3/12 17:50
 * @description:
 */
public class CompositeTest {

    public static void main(String[] args) {
        Menu home = new Menu("首页","/");
        Menu tag = new Menu("标签","/标签");
        Menu archive = new Menu("归档","/归档");
        Menu menu1 = new Menu("子菜单1","/子菜单1");
        Menu menu2 = new Menu("子菜单2","/子菜单2");
        home.add(tag);
        home.add(archive);
        tag.add(menu1);
        archive.add(menu2);
        home.getMenus().forEach(menu ->{
            System.out.println(menu);
        });
    }
}
