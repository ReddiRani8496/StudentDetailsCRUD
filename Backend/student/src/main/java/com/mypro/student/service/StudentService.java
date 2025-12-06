package com.mypro.student.service;

import com.mypro.student.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public void insertStudent(Student student);
    List<Student> getAllStudents();
    void deleteStudent(Integer rollNo);
    void updateStudent(Student student);
   Optional<Student> findStudentByRollNo(Integer rollNo);
   List<Student> findStudentByName(String name);
}
