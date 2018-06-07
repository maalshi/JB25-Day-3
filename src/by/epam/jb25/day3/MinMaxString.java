package by.epam.jb25.day3;

import java.util.Scanner;

public class MinMaxString {
	static String max = "", min = "", str = "";

	public static void main(String[] args) {
		enterStrings();
		printMinAndMax();
	}
	public static void enterStrings(){
		int n = 10;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			System.out.print("> ");
			if (sc.hasNextLine()) {
				str = sc.nextLine();
				if (i == 0) {
					min = str;
				}
				if (str.length() > max.length()) {
					max = str;
				} else if (str.length() < min.length()) {
					min = str;
				}
			}
		}
		
	}
	
	public static void printMinAndMax(){
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());		
	}
	
	
}
