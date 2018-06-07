package by.epam.jb25.day3;

import java.util.Scanner;

public class Task3 {
	
	static double x = 0;


	public static void main(String[] args) {
		enterX();
		printFunction();
		
	}
	
	public static void enterX(){
		
		Scanner sc = new Scanner(System.in);
		  
		  System.out.println("¬ведите x");
		  x = sc.nextDouble();
	}
	
	public static void printFunction(){
		
		   if (x<=3){
		    double fx = 9;
		    System.out.println(fx);
		    } else if (x>3){
		    double fx = 1/(Math.pow(x, 2)+1);
		    System.out.println(fx);
		    }
		     		   
	}


}
