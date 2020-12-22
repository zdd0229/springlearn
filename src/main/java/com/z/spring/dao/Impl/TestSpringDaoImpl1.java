package com.z.spring.dao.Impl;

import com.z.spring.dao.TestSpringDao;
import org.springframework.stereotype.Repository;

@Repository("TestSpringDaoImpl1")
public class TestSpringDaoImpl1 implements TestSpringDao {
    @Override
    public void say() {
        System.out.println("dao1---add");
    }

    @Override
    public int add(int a, int b) {
        return 0;
    }
}
