package com.application.first_boot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig{

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args -> {


            Student shubham= new Student(

                    "Shubham",
                    25, LocalDate.of(1997, AUGUST, 15),
                    "shubham@gmail.com"
            );
            Student jitendra = new Student(

                    "Jitendra",
                    25, LocalDate.of(1996, AUGUST, 15),
                    "jitendra@gmail.com"
            );

           repository.saveAll(List.of(shubham,jitendra));
        };
}

}
