package by.epam.jb25.day3;

import java.util.Scanner;

public class Task2 {

	static double f;
	static double x; 
	static double a = 0; //������ �������
	static double b = 50; //����� �������
	static double h; //���

	public static void main(String[] args) {
		
		enterVariables();
		countNumbers();
		
	}
	
		public static void enterVariables(){
			
	
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� �");
		x=sc.nextDouble();
		System.out.println("������� ����� ���� h");
		h=sc.nextDouble();
		
		}
		
		public static void countNumbers(){
		while (x<b){
			x=x+h;
			f = 2*Math.tan(x/2)+1;
			System.out.println(x + "|" +f);
		}	
		

	}

}
