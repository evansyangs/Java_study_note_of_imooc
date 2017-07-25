package com.evan;

public class CellPhone extends Telephone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过键盘来打电话");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("通过键盘发信息");
	}

}
