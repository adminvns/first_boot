package com.application.first_boot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController extends SpringBootServletInitializer {
    private final  StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService =studentService;
    }

    @GetMapping
    public List<Student> getStudents(){

        return  studentService.getStudents();
    }
}
