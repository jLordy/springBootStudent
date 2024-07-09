package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Jhay Lord",
                        "jhaylord.celeste@gmail.com",
                        19,
                        LocalDate.of(2004, Month.SEPTEMBER, 26)
                )
        );
    }
}
