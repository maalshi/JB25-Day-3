package by.epam.jb25.day3;

import java.util.Scanner;

public class LastDigit {
	static int number = 0;
	static int poslZifra;
	static int poslZifraKv;
	
	public static void main(String[] args) {
		

		enterDigit();
		calcZifra();
		printSquare();
	}
	
	
	public static void enterDigit(){

		System.out.print("Введите число: ");
		
	}
	
	
	public static void calcZifra() {
		Scanner sc = new Scanner(System.in);
		
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		poslZifra = number % 10;
		switch (poslZifra) {
		case 0:
			poslZifraKv = 0;
			break;
		case 1:
			poslZifraKv = 1;
			break;
		case 2:
			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			System.out.println("Что-то не то с программой.");
			return;
		}
	}
		

		
		public static void printSquare(){
		System.out.println("Квадрат числа " + number + " равняется "
				+ poslZifraKv);
		}


}
