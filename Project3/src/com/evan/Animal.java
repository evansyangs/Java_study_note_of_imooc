package com.evan;

public class Animal extends Object{
	public int age = 10;
	public String name;
	public void eat() {
		//final int i = 10;//常量
		//i = 20; 
		System.out.println("年龄："+age+"动物具有吃东西的能力");
	}
	public Animal() {
		System.out.println("Animal类执行了");
		//age = 20;
	}
}
