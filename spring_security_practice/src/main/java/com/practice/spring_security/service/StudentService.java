package com.practice.spring_security.service;
import com.practice.spring_security.model.StudentModel;

import java.util.List;

public interface StudentService {
    StudentModel createStudent(StudentModel student);
    List<StudentModel> getAllStudents();
    StudentModel getStudentById(Long id);
    StudentModel updateStudent(Long id, StudentModel student);
    void deleteStudent(Long id);
}
