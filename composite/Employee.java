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
public class Employee {

    /**
     * 姓名
     */
    private String name;

    /**
     * 职责
     */
    private String duties;

    private List<Employee> peopleList;

    public Employee(String name, String duties) {
        this.name = name;
        this.duties = duties;
        peopleList = new ArrayList<>();
    }

    public void add(Employee people){
        peopleList.add(people);
    }

    public void remove(Employee people){
        peopleList.remove(people);
    }
}
