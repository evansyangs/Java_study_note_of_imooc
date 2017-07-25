package com.evan;

public class Dog extends Animal {
	public int age = 20;
	public void eat() {
		System.out.println(" 狗具有吃骨头的能力");
	}
	public Dog() {
		System.out.println("Dog类执行了");
	}
	public void method() {
		super.eat();
		System.out.println(super.age);
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
	
}
