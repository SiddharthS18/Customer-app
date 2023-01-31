package com.example.customerapp.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    List<Customer> getCustomer(){
        return customerService.getCustomer();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }

    @PutMapping
    void updateNewCustomer(@RequestBody Customer customer){
        System.out.println("PUT REQUEST...");
        System.out.println(customer);
    }

    @DeleteMapping(path="{customerId}")
    void DeleteMapping(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST FOR CUSTOMER ID " + id);
    }
}
