package codes;

import java.util.Scanner;

public class Repeat_Welfare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("연 수익률 : ");
		double rate = scanner.nextDouble();

		double money = 1000;

		int year = 0;

		while (money < 2000) {
			year++;
			money = money * (1 + rate / 100);
		}

		System.out.print(year + "년 만에 2배를 넘었습니다.");

	}
}
