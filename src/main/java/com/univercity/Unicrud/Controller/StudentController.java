package com.univercity.Unicrud.Controller;

import com.univercity.Unicrud.Data.Student;
import com.univercity.Unicrud.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.Jsr310Converters;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentServices services;

    @GetMapping(path ="/students")
    public List<Student> findAllStudents(){
        return services.getAllData();
    }

    @GetMapping(path = "/student/{id}")
    public Student getStudentById(@PathVariable int id){
        return services.getStudentById(id);
    }

    @PostMapping(path = "/students")
    public Student CreateStudent(@RequestBody Student student){
        return services.createStudent(student);
    }

    @PutMapping(path = "/students")
    public Student updateStudent(@RequestBody Student student){
        return services.updateStudent(student);
    }


}
