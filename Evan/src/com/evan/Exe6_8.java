package com.evan;
import java.util.Arrays;
/*
 * Arrays类中sort与toString方法的使用
 * foreach循环输出
 */
public class Exe6_8 {
	public static void main(String[] args) {
		//定义一个字符串数组
		String hobbys[] = {"student","teacher","cleaner","nurse"};
		System.out.println("**使用for循环输出数组中的元素**");
		for(int i = 0;i < hobbys.length; i++) {
			System.out.println(hobbys[i]);
		}
		
		Arrays.sort(hobbys);//对hobbys数组进行排序
		System.out.println("**使用Arrays类的toString()方法**"
				+ "\n输出hobbys数组中的元素如下\n"+	Arrays.toString(hobbys));
		
		System.out.println("**经过排序后使用foreach循环输出数组中的元素**");
		for(String hobby : hobbys) {
			System.out.println(hobby);
		}
	}

}
