package com.mypro.student.service.impl;

import com.mypro.student.model.Student;
import com.mypro.student.repository.StudentRepository;
import com.mypro.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentRepository studentRepository;

    @Override
    public void insertStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Integer rollNo) {
        studentRepository.deleteById(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Optional<Student> findStudentByRollNo(Integer rollNo) {
        return studentRepository.findById(rollNo);
    }

    @Override
    public List<Student> findStudentByName(String name) {
        return studentRepository.findByName(name);
    }


}
