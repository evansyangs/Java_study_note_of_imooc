package com.evan;

public class InitalTelephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone phone = new Telephone();
		//phone.sendMessage();
		//1.给实例变量赋值
		phone.screen = 5.0f;
		phone.cpu = 1.4f;
		phone.mem = 2.0f;
		//2. 调用对象的方法
		phone.sendMessage();
		phone.call();
	}

}
