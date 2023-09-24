package com.univercity.Unicrud.Service;

import com.univercity.Unicrud.Data.Student;
import com.univercity.Unicrud.Data.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllData(){
        return repository.findAll();
    }

    public Student getStudentById(int id){
        Optional<Student> student = repository.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }


}
