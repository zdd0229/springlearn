package com.z.spring.service;

import com.z.spring.dao.TestSpringDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestSpringService {

    @Value("赵丁丁")
    private String name;

    @Autowired
    @Qualifier("TestSpringDaoImpl1")
    TestSpringDao testSpringDao;

    public void add() {
        System.out.println(String.format("@value注解注入：%s",name));
        testSpringDao.say();
        System.out.println("service---add");
    }

}
