package com.anuwk.controz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuwk.controz.model.Student;
import com.anuwk.controz.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getStudents() throws Exception {
		List<Student> student = null;
		try {
			student = studentRepository.find();
		} catch (Exception e) {
			throw new Exception();
		}
		return student;
	}

}
