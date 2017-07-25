package com.evan;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		System.out.println("animal age:"+animal.age);
		Dog dog = new Dog();
		dog.method();
		//dog.age = 10;
		System.out.println(dog);
		//dog.eat();
		Dog dog1 = new Dog();
		dog1.age = 15;
		Dog dog2 = new Dog();
		dog2.age = 15;
		if(dog1.equals(dog2)) {
			System.out.println("两个对象是相同的");
		}else {
			System.out.println("两个对象是不相同的");
		}
	}

}
