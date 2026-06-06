package com.example.StudentModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="students")
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {
	
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String gender;

}
