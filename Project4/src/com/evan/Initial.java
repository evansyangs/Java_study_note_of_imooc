package com.evan;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Animal obj1 = new Animal();
		Animal obj2 = new Dog();//父类的引用是可以指向子类对象
		//Dog obj3 = new Animal();//错
		Animal obj3 = new Cat();
		obj1.eat();
		obj2.eat();
		obj3.eat();
		*/
		Dog dog = new Dog();
		Animal animal = dog;//自动类型提升 向上类型转换
		if(animal instanceof Dog) {
			Dog dog2 = (Dog)animal;//向下类型转换　强制类型转换	
		}else {
			System.out.println("无法进行类型转换　转换成Dog类型");
		}
		if(animal instanceof Cat) {
			Cat cat = (Cat)animal;//1.编译时　Cat类型　２.运行时　Dog类型
		}else {
			System.out.println("无法进行类型转换　转换成Cat类型");
		}
	}

}
