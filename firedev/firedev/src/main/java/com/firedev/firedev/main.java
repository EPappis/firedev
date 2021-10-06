package com.firedev.firedev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class main {
    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
    }

//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        return encoder;
//    }
}
