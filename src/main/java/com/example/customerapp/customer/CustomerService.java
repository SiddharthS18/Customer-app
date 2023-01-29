package com.example.customerapp.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepoInterface customerRepoInterface;

    @Autowired
    public CustomerService(CustomerRepoInterface customerRepoInterface) {
        this.customerRepoInterface = customerRepoInterface;
    }

    List<Customer> getCustomer(){
       return customerRepoInterface.getCustomers();
    }
}
