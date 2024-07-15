package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ibrahim = new Student(
                    "Ibrahim",
                    "ibrahim@gmail.com",
                    LocalDate.of(2002, 9, 16)
            );
            Student saju = new Student(
                    "Saju",
                    "saju@gmail.com",
                    LocalDate.of(2004, 9, 16)
            );

            repository.saveAll(
                    List.of(ibrahim,saju)
            );
        };
    }
}
