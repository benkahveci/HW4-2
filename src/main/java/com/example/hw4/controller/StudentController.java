package com.example.hw4.controller;

import com.example.hw4.model.Student;
import com.example.hw4.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student) {
        return studentService.addNewStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }


    @PutMapping("/students")
    public Student updateExistingStudent (@RequestBody Student student){
        return studentService.updateExistingStudent(student);
    }

    @DeleteMapping("/students")
    public void deleteStudent(@RequestBody Student student){
        studentService.deleteStudent(student);
    }
}


