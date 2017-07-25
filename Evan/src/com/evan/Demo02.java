package com.evan;
import java.util.Scanner;
/*
 * 功能：实现接收三个班级的各四名学员的成绩信息，然后计算每个班级学员的平均分
 * 知识点：二重循环、外层循环控制班级的数量、内层循环控制每个班级的学员数量
 * 
 */
public class Demo02 {
	public static void main(String[] args) {
		int classNum = 3;//班级数量
		int stuNum = 4;//学员数量
		double sum = 0;//成绩总和
		double avg = 0;//成绩平均分
		Scanner input = new Scanner(System.in);
		for(int i = 0;i < classNum;i++){//外层循环控制班级的数量
			sum = 0;
			System.out.println("***请输入第"+(i+1)+"个班级的成绩： ***");
			for(int j = 0;j < stuNum;j++){
				System.out.println("请输入第"+(j+1)+"个学员的成绩： ");
				int score = input.nextInt();
				sum = sum + score;
			}
			avg = sum / stuNum;
			System.out.println("第"+(i+1)+"个班级学生的平均分为"+avg);
		}
	}
}
