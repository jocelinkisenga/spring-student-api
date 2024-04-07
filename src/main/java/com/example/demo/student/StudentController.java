package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private final StudentService studentService;

    /**
     * @param studentService
     */
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    /**
     * @return
     */
    @GetMapping
    public List<Student> getStudents() {
        return this.studentService.getStudents();
    }
    
    /**
     * @param student
     */
    @PostMapping
    public void addNewStudent(@RequestBody Student student) {
        
        studentService.addNewStudent(student);
    }
}
