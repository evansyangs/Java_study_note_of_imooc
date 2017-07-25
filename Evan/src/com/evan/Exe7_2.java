package com.evan;

public class Exe7_2 {
	public void print() {
		System.out.println("我被调用了");
	}
	public static void main(String[] args) {
		Exe7_2 object = new Exe7_2();//创建类的对象
		object.print();//调用函数
	}

}
