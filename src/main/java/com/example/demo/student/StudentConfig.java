package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student x = new Student(
                    LocalDate.of(2000, Month.APRIL, 22),
                    "x@gmail.com",
                    "x name"
            );

            Student y = new Student(
                    LocalDate.of(2000, Month.APRIL, 21),
                    "y@gmail.com",
                    "y name"
            );

            studentRepository.saveAll(List.of(x, y));
        };
    }

}
