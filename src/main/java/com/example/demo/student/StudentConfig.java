package com.example.demo.student;

import static java.time.Month.MARCH;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student jocelin = new Student(
                    "jocelin kisenga",
                    "jocelin@gmail.com",
                    LocalDate.of(2000, MARCH, 25));

            Student shuka = new Student(
                    "shuka",
                    "shuka@gmail.com",
                    LocalDate.of(2000, MARCH, 25));

            Student kisenga = new Student(
                    " kisenga",
                    "kisenga@gmail.com",
                    LocalDate.of(2000, MARCH, 25));

        studentRepository.saveAll(
            List.of(jocelin, shuka, kisenga);
            
        );
        };


    }

}
