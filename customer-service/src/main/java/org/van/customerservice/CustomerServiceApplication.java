package org.van.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.van.customerservice.entities.Customer;
import org.van.customerservice.repositories.CustomerRepository;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner lineRunner(CustomerRepository customerRepository){
        return arg->{
            customerRepository.saveAll(
                    List.of(
                            Customer.builder()
                                    .name("Modibo")
                                    .email("modibo@gmail.com")
                                    .build(),
                            Customer.builder()
                                    .name("Kone")
                                    .email("kone@gmail.com")
                                    .build(),
                            Customer.builder()
                                    .name("Moussa")
                                    .email("moussa@gmail.com")
                                    .build()
                    ));
        };
    }
}


