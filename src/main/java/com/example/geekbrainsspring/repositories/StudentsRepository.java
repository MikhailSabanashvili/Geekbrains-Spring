package com.example.geekbrainsspring.repositories;

import com.example.geekbrainsspring.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentsRepository {

    public Student findOneById(int id) {
        Student student = new Student();
        student.setFirstName("Ivan " + id);
        student.setLastName("Ivanov " + id);
        return student;
    }
}
