package com.evan;

public class Truck extends Car {
	public Truck(String mingcheng,int zujin,int zaihuo) {
		// TODO Auto-generated constructor stub
		this.mingcheng = mingcheng;
		this.zujin = zujin;
		this.zaihuo = zaihuo;
	}
	public void print() {
		System.out.println(mingcheng+" 　"+zujin+"元/天 "+"载货："+zaihuo+"吨");
	}
}
