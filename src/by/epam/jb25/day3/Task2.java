package by.epam.jb25.day3;

import java.util.Scanner;

public class Task2 {

	static double f;
	static double x; 
	static double a = 0; //начало отрезка
	static double b = 50; //конец отрезка
	static double h; //шаг

	public static void main(String[] args) {
		
		enterVariables();
		countNumbers();
		
	}
	
		public static void enterVariables(){
			
	
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите точку х");
		x=sc.nextDouble();
		System.out.println("¬ведите длину шага h");
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
