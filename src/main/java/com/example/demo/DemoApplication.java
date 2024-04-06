package com.example.demo;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.demo.Student;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@GetMapping
	public List<Student> hello(){
		return java.util.List.of(
			new Student((long) 1,
			 "jocelin",
			 "kisenga@gmail.com",
			  18, 
			  LocalDate.of(2000, Month.MARCH, 25)
			)
		);
		}

}
