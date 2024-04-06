package com.students;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.demo.Student;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
	public List<Student> getStudents(){
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
