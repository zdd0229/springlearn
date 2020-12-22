package com.z.spring.dao.proxy;

import com.z.spring.dao.TestSpringDao;

public class TestSpringDaoProxy implements TestSpringDao {
    @Override
    public void say() {
        System.out.println("方法");
    }

    @Override
    public int add(int a , int b) {
        return a+b;
    }
}
