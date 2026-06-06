package com.example.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentModel.StudentModel;
import com.example.StudentService.StudentService;

@RestController
@RequestMapping("/student")
public class Controller {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public List<StudentModel> getAll(){
		return studentService.getAll();
	}
	
	@PostMapping
	public StudentModel addStudent(@RequestBody StudentModel studentModel) {
		return studentService.addStudent(studentModel);
	}
	
	@GetMapping("/{id}")
	public StudentModel getById(@PathVariable int id) {
		return studentService.getById(id);
	}
	
	@PutMapping("/{id}")
	public StudentModel updateStudent(@PathVariable int id,@RequestBody StudentModel studentModel) {
		return studentService.updateStudent(id,studentModel);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
		return "Deleted";
	}
	

}
