package com.evan;

public class Pickup_Truck extends Car {
	public Pickup_Truck(String mingcheng,int zujin,int zairen,int zaihuo) {
		// TODO Auto-generated constructor stub
		this.mingcheng=mingcheng;
		this.zujin=zujin;
		this.zairen=zairen;
		this.zaihuo=zaihuo;
	}
	public void print() {
		System.out.println(mingcheng+"　 "+zujin+"元/天 "+"载人："+zairen+"人载货："+zaihuo+"吨");
	}

}
