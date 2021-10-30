package com.spring.dao;

import java.util.List;

import com.spring.entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int Id);
	public Student getStudent(int Id);
	List<Student>getAllStudent();

}
