package com.imooc.collection;

import java.util.HashSet;

/*
 * Ñ§ÉúÀà
 */

import java.util.Set;

public class Student {

	public String id;
	
	public String name;
	
	public Student(String id,String name){
		this.id = id;
		this.name = name;
		this.courses = new HashSet();
	}
	
	public Set courses;
}
