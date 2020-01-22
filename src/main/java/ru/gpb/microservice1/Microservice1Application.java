package ru.gpb.microservice1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Microservice1Application {

    public static void main(String[] args) {
        SpringApplication.run(Microservice1Application.class, args);
    }

}
