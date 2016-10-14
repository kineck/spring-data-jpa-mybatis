package com.yougou.service;

import com.yougou.domain.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by administrator on 16/10/14.
 */
public interface CustomerService {
    int add(Customer Customer);

    int deleteById(int id);

    int update(Customer Customer);

    Customer getById(int id);

    List<Customer> getAll();

    Customer getCustomerById(@Param("customerId") String customerId);
}
