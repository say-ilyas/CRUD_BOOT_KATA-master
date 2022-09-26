package com.example.crud_boot_kata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.crud_boot_kata"})
@EntityScan(basePackages = {"com.example.crud_boot_kata"})

public class CrudBootKataApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudBootKataApplication.class, args);
    }

}
