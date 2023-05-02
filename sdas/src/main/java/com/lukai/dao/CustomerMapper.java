package com.lukai.dao;

import com.lukai.pojo.Customer;

public interface CustomerMapper {
	
	// 根据id查询Customer
    Customer findCustomerById(int id);
}
