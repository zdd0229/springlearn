package com.z.spring.dao;

import org.springframework.stereotype.Repository;

@Repository("TestSpringDaoImpl2")
public class TestSpringDaoImpl2 implements TestSpringDao {
    @Override
    public void add() {
        System.out.println("dao2---add");
    }
}
