package com.example.geekbrainsspring.service;

import com.example.geekbrainsspring.entities.Student;
import com.example.geekbrainsspring.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {
    @Autowired
    private StudentsRepository studentsRepository;

    public Student getStudentById(int id) {
        return studentsRepository.findOneById(id);
    }

    public StudentsService() {

    }
}
