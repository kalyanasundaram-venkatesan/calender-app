package com.scroller.calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.scroller.calendar")
@EntityScan("com.scroller.calendar.model")
@EnableJpaRepositories(basePackages = "com.scroller.calendar.repository")
public class ApiApplication {
    public static void main(String args[]) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
