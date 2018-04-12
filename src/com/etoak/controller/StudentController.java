package com.etoak.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etoak.dao.OneToManyTestDao;
import com.etoak.entity.Student;
import com.etoak.page.Page;
import com.etoak.service.StudentService;

@Controller
public class StudentController {
	
	private Page page;
	private int pageIndex = 1;
	private int pageSize = 10;
	private int total = 0;
	
	@Autowired
	private Student stu;
	
	@Autowired
	private StudentService dao;
	
	@Autowired
	private OneToManyTestDao mdao;
	
	@RequestMapping("/addStudent1.do")
	public String add1(Student stu,ModelMap map) throws Exception{
		dao.addStudent(stu);
		map.put("student",stu);
		return "forward:success.jsp";
	}
	
	@RequestMapping(value = "/addStudent2.do",method = RequestMethod.POST)
	@ResponseBody
	public Map add2(Student stu) throws Exception{
		Map map = new HashMap();
		dao.addStudent(stu);
		map.put("status", "success");
		return map;
	}
	
	/**
	 * 使用mybatis拦截器分页示例
	 */
	@RequestMapping("/ShowStudents.do")
	@ResponseBody
	public Map showStudents(HttpServletRequest request,HttpServletResponse response) throws Exception{
		pageIndex = Integer.parseInt(request.getParameter("page"));
			
		total = dao.StudentCount();
		page = new Page(pageIndex,pageSize,total);
		Map map = new HashMap();
		List<Student> students = dao.selectAllStudents(stu,page);
		map.put("rows",students);
		map.put("total", total);
		System.out.println(map);
		return map;
	}
	@RequestMapping("/ShowClasses.do")
	@ResponseBody
	public Map showClasses(HttpServletRequest request,HttpServletResponse response) throws Exception{

		Map map = new HashMap();
		List<Student> students = dao.selectAllStudents(stu, page);
		map.put("rows",students);
		map.put("total", total);
		System.out.println(map);
		return map;
	}
}
