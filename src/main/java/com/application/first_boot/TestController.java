package com.application.first_boot;

import com.application.first_boot.student.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Controller
@ResponseBody
public class TestController {


    @GetMapping("/student")
    public List<Student> hello(){


    return List.of(

            new Student(1L,"Shubham Singh", 25,LocalDate.of(1997, Month.AUGUST,15),"Shubham@gmail.com"
                    )
    );
}


}
