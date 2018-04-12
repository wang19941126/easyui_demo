package com.etoak.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.etoak.entity.Student;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		 for (Iterator iter = list.iterator(); iter.hasNext();) {
			   String str = (String)iter.next();
			   System.out.println(str);
			  }
	}
}
