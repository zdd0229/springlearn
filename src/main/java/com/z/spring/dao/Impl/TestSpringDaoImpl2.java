package com.z.spring.dao.Impl;

import com.z.spring.dao.TestSpringDao;
import org.springframework.stereotype.Repository;

@Repository("TestSpringDaoImpl2")
public class TestSpringDaoImpl2 implements TestSpringDao {
    @Override
    public void say() {
        System.out.println("dao2---add");
    }

    @Override
    public int add(int a, int b) {
        return 0;
    }
}
