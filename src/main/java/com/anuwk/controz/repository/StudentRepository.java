package com.anuwk.controz.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.anuwk.controz.model.Student;

@Mapper
public interface StudentRepository {
	
	static final String SQL_SELECT_STUDENT = "SELECT * FROM student";
	
	@Select(SQL_SELECT_STUDENT)
	public List<Student> find();


}
