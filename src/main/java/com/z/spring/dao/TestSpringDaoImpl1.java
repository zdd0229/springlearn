package com.z.spring.dao;

import org.springframework.stereotype.Repository;

@Repository("TestSpringDaoImpl1")
public class TestSpringDaoImpl1 implements TestSpringDao {
    @Override
    public void add() {
        System.out.println("dao1---add");
    }
}
