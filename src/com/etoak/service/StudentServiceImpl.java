package com.etoak.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etoak.dao.StudentDaoIF;
import com.etoak.entity.Student;
import com.etoak.exception.AddStudentException;
import com.etoak.page.Page;
import com.etoak.page.SearchPageUtil;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDaoIF dao;
	
	@Override
	public int addStudent(Student stu) throws Exception {
		int i = 0;
		try {
			i = dao.addStudent(stu);
		} catch (Exception e) {
			throw new AddStudentException();
		}
		return i;
	}

	@Override
	public int delStudentById(int id) {
		return dao.delStudentById(id);
	}

	@Override
	public int updateStudent(Student stu) {
		return dao.updateStudent(stu);
	}

	@Override
	public Student selectStudentById(int id) {
		return dao.selectStudentById(id);
	}

	@Override
	public List<Student> selectAllStudents(Student stu,Page page) {
		SearchPageUtil searchPageUtil = new SearchPageUtil();
		String a[] = { "name  desc", "id asc" };
		searchPageUtil.setOrderBys(a);
		searchPageUtil.setPage(page);
		searchPageUtil.setObject(stu);
		final List list = dao.selectAllStudents(searchPageUtil);
		return list;
	}

	@Override
	public int StudentCount() {
		return dao.StudentCount();
	}

	@Override
	public List<Student> selectStudentByPage(Map map) {
		return dao.selectStudentByPage(map);
	}

}
