package com.z.spring.dao;

import com.z.spring.domain.Customer;

import java.util.List;

public interface CustomerDao {

    Integer insert(Customer customer);

    Integer update();

    Integer delete();

    Integer count();

    Customer selectOne();

    List<Customer> selectList();
    
    int[] batchAdd();

    int[] batchUpdate();

    int[] batchDelete();

    Integer addMoney(String custId,Integer money);

    Integer reduceMoney(String custId,Integer money);
}
