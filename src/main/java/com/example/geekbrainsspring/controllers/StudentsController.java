package com.example.geekbrainsspring.controllers;

import com.example.geekbrainsspring.entities.Student;
import com.example.geekbrainsspring.entities.Students;
import com.example.geekbrainsspring.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @GetMapping("/showStudent")
    public String hello(Model uiModel) {
        Student[] students = new Student[2];
        students[0] = studentsService.getStudentById(10);
        students[1] = studentsService.getStudentById(20);

        Students studentsList = new Students();
        studentsList.setStudents(students);

        uiModel.addAttribute("students", studentsList);
        return "students";
    }

    @GetMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Student student = new Student();
        uiModel.addAttribute("student", student);
        return "student-form";
    }


    @GetMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {
        return "student-form-result";
    }
}
