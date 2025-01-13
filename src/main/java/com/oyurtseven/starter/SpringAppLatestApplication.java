package com.oyurtseven.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.oyurtseven")
@EntityScan(basePackages = "com.oyurtseven")
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.oyurtseven"})
public class SpringAppLatestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAppLatestApplication.class, args);
    }
}
