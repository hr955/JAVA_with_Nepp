package codes;

import java.util.Scanner;

public class ConditionTest04_LeapYear {

	// 윤년 계산기
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력 : ");
		int year = scanner.nextInt();
		scanner.close();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
	}
}
