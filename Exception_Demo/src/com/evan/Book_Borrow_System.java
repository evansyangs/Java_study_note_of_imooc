package com.evan;
import java.util.Scanner;

public class Book_Borrow_System {

	static String[] booknames = {"����","���ݽṹ","C����"};
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws DrunkException {
		// TODO Auto-generated method stub
		System.out.println("��ѡ��1-���������в�ѯ��2������Ž��в���");
		try {
			int fangfa = input.nextInt();
			if(fangfa == 1)
				search1();
			if(fangfa == 2)
				search2();
		} catch (Exception e) {
			// TODO: handle exception
			throw new DrunkException("��������");
		}

	}
	public static void search1() throws DrunkException{
		System.out.println("����ͼ������");
		String bookname = input.nextLine();
		int flag = 1;
		for(int i = 0; i<3; i++){
			if(bookname.equals(booknames[i])){
				System.out.println("book:"+bookname);
				flag = 0;
			}
		}
		if(flag==1){
			throw new DrunkException("ͼ�鲻���ڣ�����������");
		}
	}
	
	private static void search2() throws DrunkException {
		// TODO Auto-generated method stub
		System.out.println("����ͼ�����");
		int bookxuhao = input.nextInt();
		int flag =1;
		for(int i = 0; i<3; i++){
			if(bookxuhao == (i+1)){
				System.out.println("book:"+booknames[i]);
				flag = 0;
			}
		}
		if(flag==1){
			throw new DrunkException("ͼ�鲻���ڣ�����������");
		}
	}

}
