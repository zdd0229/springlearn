package com.z.spring.domain;

public class Student {

    public Student(){
        System.out.println("无参构造方法");
    }

    private Long num;
    private String name;

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        System.out.println("set方法");
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void initMethod(){
        System.out.println("初始化方法");
    }

    public void destoryMethod(){
        System.out.println("销毁方法");
    }

}
