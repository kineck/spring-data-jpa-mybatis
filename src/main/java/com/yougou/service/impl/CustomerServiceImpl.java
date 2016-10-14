package com.yougou.service.impl;

import com.yougou.dao.mapper.CustomerMapper;
import com.yougou.domain.Customer;
import com.yougou.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by administrator on 16/10/14.
 */

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public int add(Customer customer) {
        return customerMapper.add(customer);
    }

    @Override
    public int deleteById(int id) {
        return customerMapper.deleteById(id);
    }

    @Override
    public int update(Customer customer) {
        return customerMapper.update(customer);
    }

    @Override
    public Customer getById(int id) {
        return customerMapper.getById(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerMapper.getAll();
    }

    @Override //@Param("customerId")
    public Customer getCustomerById(String customerId) {
        return customerMapper.getCustomerById(customerId);
    }
}
