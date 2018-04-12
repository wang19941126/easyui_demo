package com.etoak.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.etoak.entity.Classes;

public interface OneToOneTestDao {
	
	@Select("select c.id class_id,c.name class_name, t.id teacher_id ,t.name teacher_name" +
			" from classes c ,teacher t " +
			"where c.id = t.id")
	@ResultMap("com.etoak.dao.OneToOneTestDao.classes")
	public List<Classes> listClasses();
}
