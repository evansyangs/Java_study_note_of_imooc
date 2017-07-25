package com.evan;
import java.util.Scanner;

public class DaDaRentCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Car[] CarList = {new PassengerCar("奥迪A4",500,4),new PassengerCar("马自达６",400,4),new Pickup_Truck("皮卡雪6",450,4,2),new PassengerCar("金龙　　",800,20),new Truck("松花江",400,4),new Truck("依维柯",1000,20)};
		System.out.println("欢迎使用答答租车系统：\n您是否需要租车：1是0否");
		int iscontinue = input.nextInt();
		if(iscontinue==0) {
			System.out.println("您已退出租车系统");
			System.exit(0);
		}
		System.out.println("您可以租车的类型及其价目表：");
		System.out.println("序号　汽车名称　租金　　容量");
		for(int i=0;i<CarList.length;i++) {
			System.out.print((i+1)+"　　 ");
			CarList[i].print();
		}
		System.out.println("请输入您要租汽车的数量：");
		int[] Guestcarlist = {0,0,0,0,0,0};
		int zucheshuliang = input.nextInt();
		for(int i = 0;i < zucheshuliang;i++) {
			System.out.println("请输入第"+(i+1)+"辆车的序号");
			int k = input.nextInt();
			Guestcarlist[k-1]=1;
		}
		System.out.println("请输入租车天数");
		int zuchetianshu = input.nextInt();
		System.out.println("以下是您的账单");
		int SumPrice = 0;//总金额
		int Sumzairen = 0;//载人量
		int Sumzaihuo = 0;//载货量
		for(int i=0;i<zucheshuliang;i++) {
			if(Guestcarlist[i]==1) {
				System.out.print(CarList[i].mingcheng+" ");
				SumPrice += CarList[i].zujin;
				Sumzaihuo += CarList[i].zaihuo;
				Sumzairen += CarList[i].zairen;
			}
		}
		System.out.println("\n***共载人："+Sumzairen*zuchetianshu+"人");//显示为0
		System.out.println("***共载货："+Sumzaihuo*zuchetianshu+"吨");//显示为0
		System.out.println("***租车总价格："+SumPrice*zuchetianshu+"元");
		

	}

}
