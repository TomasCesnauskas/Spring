package com.springdemo.service;

import com.springdemo.dao.CustomerDAO;
import com.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomServiceImpl implements CustomerService{

//    we need inject customerDAO
    @Autowired
    private CustomerDAO customerDAO;


    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomer();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);


    }

    @Override
    @Transactional
    public Customer getCustomer(int id) {
      return  customerDAO.getCustomer(id);
    }
}
