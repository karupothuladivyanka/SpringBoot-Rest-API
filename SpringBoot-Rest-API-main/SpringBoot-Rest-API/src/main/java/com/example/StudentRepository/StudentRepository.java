package com.example.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentModel.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel,Integer> {

}
