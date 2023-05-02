package com.lukai.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lukai.pojo.Customer;
import com.lukai.service.CustomerService;

public class CustomerServiceTest {
	@Autowired
    private CustomerService customerService;


    @Test	
    public void testFindCustomerById() {
        Customer customer = customerService.findCustomerById(1);
        assertEquals(1, customer.getId());
        
    }

}
