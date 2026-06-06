package com.example.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentModel.StudentModel;
import com.example.StudentRepository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<StudentModel> getAll() {
		return studentRepository.findAll();
	}
	
	public StudentModel getById(int id) {
		return studentRepository.findById(id).get();
	}
	
	public StudentModel addStudent(StudentModel studentModel) {
		return studentRepository.save(studentModel);
	}

	public StudentModel updateStudent(int id,StudentModel studentModel) {
		StudentModel sm=studentRepository.findById(id).get();
		sm.setName(studentModel.getName());
		sm.setAge(studentModel.getAge());
		sm.setGender(studentModel.getGender());
		return studentRepository.save(sm);
	}
	
	public void deleteStudent(int id) {
		StudentModel sm=studentRepository.findById(id).get();
		studentRepository.delete(sm);
		}
}
