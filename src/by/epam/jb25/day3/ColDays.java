package by.epam.jb25.day3;

import java.util.Scanner;

public class ColDays {

	static int month = 0;
	static int year = 0;
	static int col_day = 0;

	public static void main(String[] args) {
		enterYear();
		enterMonth();
		calculateDays();

	}

	public static void enterYear() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите год: ");
		if (sc.hasNextInt()) {
			int year = sc.nextInt();
		}
	}

	public static void enterMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите номер месяца: ");
		if (sc.hasNextInt()) {
			month = sc.nextInt();
		}
	}

	public static void calculateDays() {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			col_day = 31;
			break;
		case 2:
			if (year % 4 == 0) {
				col_day = 29;
			} else {
				col_day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			col_day = 30;
			break;
		}
		System.out.println("Количество дней равно - " + col_day);
	}

}
