package com.evan;
import java.util.Scanner;

public class Book_Borrow_System {

	static String[] booknames = {"高数","数据结构","C语言"};
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws DrunkException {
		// TODO Auto-generated method stub
		System.out.println("请选择：1-按书名进行查询；2—按序号进行查找");
		try {
			int fangfa = input.nextInt();
			if(fangfa == 1)
				search1();
			if(fangfa == 2)
				search2();
		} catch (Exception e) {
			// TODO: handle exception
			throw new DrunkException("错误命令");
		}

	}
	public static void search1() throws DrunkException{
		System.out.println("输入图书名称");
		String bookname = input.nextLine();
		int flag = 1;
		for(int i = 0; i<3; i++){
			if(bookname.equals(booknames[i])){
				System.out.println("book:"+bookname);
				flag = 0;
			}
		}
		if(flag==1){
			throw new DrunkException("图书不存在，请重新输入");
		}
	}
	
	private static void search2() throws DrunkException {
		// TODO Auto-generated method stub
		System.out.println("输入图书序号");
		int bookxuhao = input.nextInt();
		int flag =1;
		for(int i = 0; i<3; i++){
			if(bookxuhao == (i+1)){
				System.out.println("book:"+booknames[i]);
				flag = 0;
			}
		}
		if(flag==1){
			throw new DrunkException("图书不存在，请重新输入");
		}
	}

}
