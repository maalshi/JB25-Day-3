package by.epam.jb25.day3;

import java.util.Scanner;

public class Line01 {

	static int number = 0;
	static int digit = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void enterNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �����: ");
		if (sc.hasNextInt())
			number = sc.nextInt();
	}

	public static void defineNumber() {
		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
				System.out.println("� ����� ���� ������ �����.");
				return;
			}
		}
		System.out.println("� ����� ��� ������ ����.");
	}

}
