package com.etoak.dao;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.etoak.entity.Student;
import com.etoak.page.SearchPageUtil;

@Repository
public interface StudentDaoIF {
	
	@Insert("insert into student values(null,#{name},#{password})")
	@Options(useGeneratedKeys = true , keyProperty = "id")
	public int addStudent(Student stu);
	
	@Delete("delete from student where id=#{id}")
	public int delStudentById(int id);
	
	@Update("update student set name=#{name},password=#{password} where id=#{id}")
	public int updateStudent(Student stu);
	
	@Select("select * from student where id=#{id}")
	@Results({
		@Result(column = "id" , property = "id"),
		@Result(column = "name" , property = "name"),
		@Result(column = "password" , property = "password")
	})
	public Student selectStudentById(int id);
	
	/**
	 * 根据条件查询
	 * @param searchPageUtil
	 * @return
	 */
	@Select("select * from student")
	@Results({
		@Result(column = "id" , property = "id"),
		@Result(column = "name" , property = "name"),
		@Result(column = "password" , property = "password")
	})
	public List<Student> selectAllStudents(SearchPageUtil searchPageUtil);
	
	/**
	 * 查询总数
	 * @return
	 */
	@Select("select count(*) from student")
	public int StudentCount();
	
	@Select(" select * from student limit #{start},#{max};")
	@Results({
		@Result(column = "id" , property = "id"),
		@Result(column = "name" , property = "name"),
		@Result(column = "password" , property = "password")
	})
	public List<Student> selectStudentByPage(Map map);
} 
