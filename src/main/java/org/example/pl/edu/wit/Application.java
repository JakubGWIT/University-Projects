package org.example.pl.edu.wit;

import lombok.Data;
import org.springframework.boot.SpringApplication;

@Data
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}