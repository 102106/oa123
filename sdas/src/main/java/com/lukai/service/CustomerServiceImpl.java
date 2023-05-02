package com.lukai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukai.dao.CustomerMapper;
import com.lukai.pojo.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerMapper customerMapper;
	
	public Customer findCustomerById(int id) {
		System.out.println(customerMapper.findCustomerById(1));
		return customerMapper.findCustomerById(1);
		
	}

	

}
