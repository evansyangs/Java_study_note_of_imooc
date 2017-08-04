package com.imooc.collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;


/*
 * ��ѡ�γ���
 */
public class ListTest {
	
	/*
	 * ���ڴ�ű�ѡ�γ̵�List
	 */
	public List coursesToSelect;
	
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	
	/*
	 * ������courseToSelect�����ӱ�ѡ�γ�
	 *
	 */
	public void testAdd(){
		//����һ���γ̶��󣬲�ͨ��add���������ӵ���ѡ�γ�List��
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("�����˿γ�: " + temp.id+":"+temp.name);
	
		Course cr2 = new Course("2", "C����");
		coursesToSelect.add(0,cr2);
		Course temp2 =(Course) coursesToSelect.get(0);
		System.out.println("�����˿γ�: " + temp2.id+":"+temp2.name);
	
		coursesToSelect.add(cr1);
		Course temp0 = (Course) coursesToSelect.get(2);
		System.out.println("�����˿γ�: " + temp0.id+":"+temp0.name);
	
		//���·������׳������±�Խ���쳣
//		Course cr3 = new Course("3", "test");
//		coursesToSelect.add(4,cr3);
		
		Course[] course = {new Course("3", "��ɢ��ѧ"),new Course("4", "�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(3);
		Course temp4 = (Course) coursesToSelect.get(4);
		System.out.println("���������ſγ̣�"+temp3.id+":"+temp3.name+";"+temp4.id+":"+temp4.name);
	
		Course[] course2 = {new Course("5", "�ߵ���ѧ"),new Course("6", "��ѧӢ��")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("���������ſγ̣�"+temp5.id+":"+temp5.name+";"+temp6.id+":"+temp6.name);
		
	}
	
	/*
	 * ȡ��List�е�Ԫ�صķ���
	 */
	public void testGet() {
		int size = coursesToSelect.size();
		System.out.println("�����¿γ̴�ѡ��");
		for(int i=0;i<size;i++){
			Course cr = (Course) coursesToSelect.get(i);
			System.out.println("�γ�"+cr.id+":"+cr.name);
		}
	}
	
	/*
	 * ͨ��������������List
	 */
	public void testIterator() {
		//ͨ�����ϵ�iterator������ȡ�õ�������ʵ��
		Iterator it = coursesToSelect.iterator();
		System.out.println("�����¿γ̴�ѡ(ͨ������������)��");
		while(it.hasNext()){
			Course cr = (Course) it.next();
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
			
		}
	}
	
	/*
	 * ͨ��for each�������ʼ���Ԫ��
	 */
	public void testForEach() {
		System.out.println("�����¿γ̴�ѡ(ͨ��for each����)��");
		for(Object obj:coursesToSelect){
			Course cr = (Course) obj;
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
	}

}