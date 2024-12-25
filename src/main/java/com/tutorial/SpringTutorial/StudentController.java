package com.tutorial.SpringTutorial;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "abc", 70),
            new Student(2, "pqr", 80),
            new Student(3, "xyz", 90)
    ));

    @GetMapping("/students/")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("/students/")
    public Student addStudents(@RequestBody Student student){
        students.add(student);
        return student;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");

    }


}
