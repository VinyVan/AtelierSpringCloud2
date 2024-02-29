package org.van.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.van.inventoryservice.entities.Product;
import org.van.inventoryservice.repositories.ProductRepository;

import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository,
                                               RepositoryRestConfiguration repositoryRestConfiguration){

        repositoryRestConfiguration.exposeIdsFor(Product.class);
        return args -> {
            productRepository.saveAll(
            List.of(
                    Product.builder()
                            .name("PC")
                            .price(12500.0)
                            .quantity((int)(Math.random()*100))
                            .build(),
                    Product.builder()
                            .name("MAC")
                            .price(14500.0)
                            .quantity((int)(Math.random()*100))
                            .build(),
                    Product.builder()
                            .name("Souris")
                            .price(120.0)
                            .quantity((int)(Math.random()*100))
                            .build()

            ));
        };
    }
}
