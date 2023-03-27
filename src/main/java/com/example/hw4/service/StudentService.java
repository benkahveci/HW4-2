package com.example.hw4.service;


import com.example.hw4.model.Student;
import com.example.hw4.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student addNewStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateExistingStudent(Student student) {
    return studentRepository.save(student);
    }


    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

    public Optional<Student> getStudentById(Integer id) {
        return studentRepository.findById(Long.valueOf(id));
    }
}
