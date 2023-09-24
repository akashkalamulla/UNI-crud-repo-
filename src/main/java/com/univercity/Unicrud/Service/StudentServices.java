package com.univercity.Unicrud.Service;

import com.univercity.Unicrud.Data.Student;
import com.univercity.Unicrud.Data.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllData(){
        return repository.findAll();
    }

}
