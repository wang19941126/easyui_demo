package com.etoak.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
public  class  Student {
		
		private int id;
		private String name;
		private String password;
		
		public Student(String name) {
			super();
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "student:[id="+id+",name="+name+",password="+password+"]";
		}
		
		
}
