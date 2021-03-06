package com.evan;
import java.util.Scanner;
/*
 * 功能：为指定的成绩进行加分，直至分数大于等于60为止
 * 输出加分前后的成绩，并统计加分的次数
 * 步骤：
 * 1.定义变量count，保存加分次数
 * 2.使用循环为成绩加分
 * 3.每次执行循环加分操作
 * 使用Scanner工具类来获取用户输入的信息
 * Scanner类位于java.util包中，使用时需要导入此包
 * 步骤：
 * 1. 导入java.util.Scanner
 * 2. 创建Scanner对象
 * 3. 接收并保存用户输入的值 
 */
public class HelloWorld {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//创建Scannerd对象input
		//print和println区别：println输出信息后会换行，而print不会换行
		System.out.print("请输入信息：");
		int score = input.nextInt();//获取用户输入的信息并保存在变量中
		//int score = 53;//保存成绩
		int count = 0;//保存加分次数
		System.out.println("加分前成绩： "+score);//打印输出加分前成绩
		for(;score<60;count++)
		{
			score++;
		}
		System.out.println("加分后成绩： "+score);//打印输出加分后成绩
		System.out.println("共加了"+count+"次！");
	}

}
