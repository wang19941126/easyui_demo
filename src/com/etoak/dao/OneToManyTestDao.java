package com.etoak.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.etoak.entity.Classes;

public interface OneToManyTestDao {
	@Select("select c.id class_id,c.name class_name, t.id teacher_id ,t.name teacher_name ,s.id student_id,s.name student_name,s.password student_password" +
			" from classes c ,teacher t,student s " +
			" where c.id = t.id and c.id = s.class_id")
	@ResultMap("com.etoak.dao.OneToManyTestDao.classes")
	public List<Classes> listStudents();
}
