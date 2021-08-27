package codes;

import java.util.Scanner;

public class Repeat_Practice {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("두개의 숫자 입력 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.print(i + " ");
			}
		}

		scanner.close();

	}
}
