package com.example.geekbrainsspring.controllers;

import com.example.geekbrainsspring.entities.Student;
import com.example.geekbrainsspring.entities.Students;
import com.example.geekbrainsspring.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController("/student")
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


    @GetMapping(path = "/showStudentById")
    @ResponseBody
    public Student showStudentById(Model uiModel, @RequestParam int id) {
        return studentsService.getStudentById(id);
    }

    @GetMapping(path = "/showStudentById/{sid}")
    @ResponseBody
    public Student showStudentById(@PathVariable("sid") int id) {
        return studentsService.getStudentById(id);
    }

    @PostMapping(path = "/setStudentById")
    public void setStudent(@RequestBody Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getCountry());
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
