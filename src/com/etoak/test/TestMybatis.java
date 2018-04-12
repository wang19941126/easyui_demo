package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.etoak.dao.OneToManyTestDao;
import com.etoak.entity.Student;
import com.etoak.service.StudentService;

public class TestMybatis {
	public static void main(String[] args) throws Exception {
		 ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		  ac = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		 StudentService dao = (StudentService)ac.getBean("studentServiceImpl");
		 Student stu = (Student)ac.getBean("student");
		// OneToOneTestDao odao = (OneToOneTestDao)ac.getBean("oneToOneTestDao");
		//System.out.println(odao.listClasses());
		 OneToManyTestDao mdao = (OneToManyTestDao)ac.getBean("oneToManyTestDao");
		 System.out.println(mdao.listStudents());
		/* stu.setName("a");
		 stu.setPassword("1aaaaaaaaaaaaaaaaaaaaaaaa");
		 dao.addStudent(stu);
		 List<Student> list;*/
		//list = dao.selectAllStudents();
		//System.out.println(list.get(0).getName());
	}
}
