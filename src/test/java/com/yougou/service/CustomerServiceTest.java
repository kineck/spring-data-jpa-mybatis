package com.yougou.service;

import com.yougou.MybatisTest;
import com.yougou.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by administrator on 16/10/14.
 */

public class CustomerServiceTest extends MybatisTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void add() throws Exception {
        Customer customer = new Customer();
        customer.setAge(12);
        customer.setBirth(new Date());
        customer.setEmail("admin@administrator.com");
        customer.setLastName("king");
        customerService.add(customer);
    }

    @Test
    public void deleteById() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void getById() throws Exception {

    }

    @Test
    public void getAll() throws Exception {

    }

    @Test
    public void getCustomerById() throws Exception {

    }

}