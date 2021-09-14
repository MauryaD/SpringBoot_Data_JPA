package com.example.Springbootpractical.service;

import com.example.Springbootpractical.entity.Student;
import com.example.Springbootpractical.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceImplTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student response = studentRepository.save(Student.builder().name("Ashish").build());

        assert(response.getName().equalsIgnoreCase("ashish"));
    }

}