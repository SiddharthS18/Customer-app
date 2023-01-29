package com.example.customerapp.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerRepository implements CustomerRepoInterface {
    @Override
    public List<Customer> getCustomers() {
        //TODO connect to real DB
        return Arrays.asList(
                new Customer(1L,"connect to real DB"),
                new Customer(2L,"Jimmy Kimmel"),
                new Customer(3L, "James Bond"),
                new Customer(4L, "Michael scott")
        );
    }
}
