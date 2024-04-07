package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents() {

        return this.studentRepository.findAll();
        // return List.of(
        //         new Student((long) 1,
        //                 "jocelin kisenga",
        //                 "jocelin@gmail.com",
        //                 LocalDate.of(2000, Month.MARCH, 25)));
    }

}
