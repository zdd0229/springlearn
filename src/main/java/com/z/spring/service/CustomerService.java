package com.z.spring.service;

import com.z.spring.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

@Service
@Transactional(propagation = Propagation.REQUIRED,timeout = -1,isolation = Isolation.DEFAULT,readOnly = false,
        rollbackFor = ArithmeticException.class,noRollbackFor = FileNotFoundException.class)
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void accountMoney(){

        customerDao.addMoney("1000000001",500);

//        int a = 10 /0;

        customerDao.reduceMoney("1000000002",500);

    }

}
