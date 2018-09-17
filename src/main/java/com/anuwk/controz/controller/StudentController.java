package com.anuwk.controz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anuwk.controz.model.Student;
import com.anuwk.controz.service.StudentService;




@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getStudentById() throws Exception {
		List<Student> student = studentService.getStudents();
		return student;	
	}

}
