package com.stogur;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class LabThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabThymeleafApplication.class, args);
    }



        @Bean
        public Faker faker(){
            return new Faker();
        }

}
