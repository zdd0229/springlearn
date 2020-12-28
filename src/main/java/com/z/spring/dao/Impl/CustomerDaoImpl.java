package com.z.spring.dao.Impl;

import com.z.spring.dao.CustomerDao;
import com.z.spring.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer insert(Customer customer) {

        String sql= "insert customers values (?,?,?,?,?,?,?,?,?)";
        int res = jdbcTemplate.update(sql,"1000000006","Fun4All","829 Riverside Drive","Phoenix","AZ","88888",
                "USA","Denise L. Stephens","dstephens@fun4all.com");

        return res;
    }

    @Override
    public Integer update() {

        String sql="update customers set cust_name = ? where cust_id = ?";

        int res = jdbcTemplate.update(sql,"ZDD","1000000006");

        return res;
    }

    @Override
    public Integer delete() {
        String sql="delete from customers where cust_id = ?";

        int res = jdbcTemplate.update(sql,"1000000006");

        return res;
    }

    @Override
    public Integer count() {
        String sql="select count(*) from customers";

        int res = jdbcTemplate.queryForObject(sql,Integer.TYPE);

        return res;
    }

    @Override
    public Customer selectOne() {
        String sql="select * from customers where cust_id = ? ";

        Customer res = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Customer>(Customer.class),"1000000005");

        return res;
    }

    @Override
    public List<Customer> selectList() {
        String sql="select * from customers";

        List<Customer> res = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Customer>(Customer.class));

        return res;
    }

    @Override
    public int[] batchAdd() {
        String sql="insert customers values (?,?,?,?,?,?,?,?,?)";

        List<Object[]> params = new ArrayList<>();

        Object[] param1= new Object[]{"1000000006","Fun4All","829 Riverside Drive","Phoenix","AZ","88888",
                "USA","Denise L. Stephens","dstephens@fun4all.com"};
        Object[] param2= new Object[]{"1000000007","Fun4All","829 Riverside Drive","Phoenix","AZ","88888",
                "USA","Denise L. Stephens","dstephens@fun4all.com"};

        params.add(param1);
        params.add(param2);

        int[] ints = jdbcTemplate.batchUpdate(sql, params);

        return ints;
    }

    @Override
    public int[] batchUpdate() {
        String sql="update customers set cust_name = ? where cust_id = ?";

        List<Object[]> params = new ArrayList<>();

        Object[] param1= new Object[]{"ZDD1","1000000006"};
        Object[] param2= new Object[]{"ZDD2","1000000007"};

        params.add(param1);
        params.add(param2);

        int[] ints = jdbcTemplate.batchUpdate(sql, params);

        return ints;
    }

    @Override
    public int[] batchDelete() {
        String sql="delete from customers where cust_id = ?";

        List<Object[]> params = new ArrayList<>();

        Object[] param1= new Object[]{"1000000006"};
        Object[] param2= new Object[]{"1000000007"};

        params.add(param1);
        params.add(param2);

        int[] ints = jdbcTemplate.batchUpdate(sql, params);

        return ints;
    }

    @Override
    public Integer addMoney(String custId, Integer money) {
        String sql="update customers set money = money + ? where cust_id = ?";

        int res = jdbcTemplate.update(sql,money,custId);

        return res;
    }

    @Override
    public Integer reduceMoney(String custId, Integer money) {
        String sql="update customers set money = money - ? where cust_id = ?";

        int res = jdbcTemplate.update(sql,money,custId);

        return res;
    }

}
