package com.mypro.student.repository;

import com.mypro.student.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

    // MongoRepository<ModelClassname, primary key datatype>


    List<Student> findByName(String name);
}
