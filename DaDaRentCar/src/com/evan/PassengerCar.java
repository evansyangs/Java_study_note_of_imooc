package com.evan;

public class PassengerCar extends Car {
	
	public PassengerCar(String mingcheng,int zujin,int zairen) {
		// TODO Auto-generated constructor stub
		this.mingcheng = mingcheng;
		this.zujin = zujin;
		this.zairen = zairen;
	}
	public void print() {
		System.out.println(mingcheng+" 　"+zujin+"元/天 "+"载人："+zairen+"人");
	}
}
