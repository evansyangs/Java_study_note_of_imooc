package com.evan;

public class ChainTest {
	/*
	 * test1():�׳����ȴ��ˡ��쳣
	 * test2():����test1()�����񡰺ȴ����쳣�������Ұ�װ������ʱ�쳣�������׳�
	 * main�����У�����test2()�����Բ���test2()�����׳����쳣
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest ct = new ChainTest();
		try {
			ct.test2();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	public void test1() throws DrunkException{
		// TODO Auto-generated method stub
		throw new DrunkException("�ȳ��𿪾�");
	}
	
	public void test2() {
		try {
			test1();
		} catch (Exception e) {
			// TODO: handle exception
			RuntimeException newExc = new RuntimeException(e);
		//	newExc.initCause(e);
			throw newExc;
		}
		
	}

}
