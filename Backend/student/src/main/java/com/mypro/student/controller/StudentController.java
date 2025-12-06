package com.mypro.student.controller;


import com.mypro.student.model.Student;
import com.mypro.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://127.0.0.1:5500")
public class StudentController {

    @Autowired
    StudentService studentService;


    // http://localhost:8080/student/insert  -> api
    @PostMapping("/insert")
    public void insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
    }


    // http://localhost:8080/student/allStudents
    @GetMapping("/allStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    // http://localhost:8080/student/delete?value
    @DeleteMapping("/delete/{rollNo}")
    public void deleteStudent(@PathVariable Integer rollNo) {
        studentService.deleteStudent(rollNo);
    }

    // http://localhost:8080/student/update
    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    // http://localhost:8080/student/findStudentById/rollNumber
    @GetMapping("/findStudentById/{rollNo}")
    public Optional<Student> findStudentByRollNo(@PathVariable Integer rollNo) {
        return studentService.findStudentByRollNo(rollNo);
    }

    // http://localhost:8080/student/findStudentByName/name
    @GetMapping("/findStudentByName/{name}")
    public List<Student> findByName(@PathVariable String name) {
        return studentService.findStudentByName(name);
    }

}
