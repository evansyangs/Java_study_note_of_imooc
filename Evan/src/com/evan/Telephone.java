package com.evan;

//1. 定义一个类
public class Telephone {
	//2. 属性（成员变量）有什么
	float screen;
	float cpu;
	float mem;
	int var;
	//3, 方法 干什么
	void call() {
		int localVar = 0;//局部变量
		System.out.println("localVar: "+localVar);
		System.out.println("var: "+var);
		System.out.println("Telephone有打电话的功能");
	}
	void sendMessage() {
		System.out.println("var: "+var);
		System.out.println("screen: "+screen+"cpu: "+cpu+"mem: "+mem+"Telephone有发短信的功能");
	}
}
