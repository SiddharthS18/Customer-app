package com.example.customerapp.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CustomerConfig {
    @Value("${app.useFakeCustomerRepo:false}")
    private boolean useFakeCustomerRepo;
    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Command Line Runner");
        };
    }

    @Bean @Primary
    CustomerRepoInterface customerRepo(){
        System.out.println("useFakeCustomerRepo is:" + useFakeCustomerRepo);
        return useFakeCustomerRepo ? new CustomerFakeRepo() : new CustomerRepository();
    }
}
