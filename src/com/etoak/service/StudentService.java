package com.etoak.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.etoak.entity.Student;
import com.etoak.page.Page;


@Service
public interface StudentService{
	public int addStudent(Student stu) throws Exception;
	public int delStudentById(int id);
	public int updateStudent(Student stu);
	public Student selectStudentById(int id);
	public List<Student> selectAllStudents(Student stu,Page page);
	public int StudentCount();
	public List<Student> selectStudentByPage(Map map);
}
	