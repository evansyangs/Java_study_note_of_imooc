package com.evan;
import com.evan.Telephone;
public class InitialTelephone {
	
	public static void main(String[] args) {
		//通过无参的构造方法创建对象
		Telephone phone = new Telephone();
		//通过有参的构造方法创建对象 并给对象中的实例变量赋初值
		/*
		Telephone phone2 = new Telephone(1.5f,1.4f,2.0f);
		//phone2.cpu = 6.0f;
		phone2.setScreen(6.0f);
		System.out.println("screen: "+phone2.getScreen());
		*/
		Telephone phone1 = new Telephone();
		Telephone phone2 = new Telephone();
		phone1.setCpu(2.0f);
		phone2.setCpu(2.0f);
		phone1.setMem(4);
		phone2.setMem(4);
		phone1.setScreen(5.0f);
		phone2.setScreen(5.0f);
		if(phone1.equals(phone2)) {
			System.out.println("两手机相同");
		}else {
			System.out.println("两手机不相同");
		}
	}

}
