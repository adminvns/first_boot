package com.application.first_boot.student;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {

    public List<Student> getStudents() {

        return List.of(

                new Student(1L, "Shubham Singh", 25, LocalDate.of(1997, Month.AUGUST, 15), "Shubham@gmail.com"
                )
        );

    }
}