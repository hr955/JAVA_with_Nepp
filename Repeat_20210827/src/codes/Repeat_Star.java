package codes;

import java.util.Scanner;

public class Repeat_Star {
	public static void main(String[] args) {

		// 정사각형
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("============");

		// 기본삼각형
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("============");

		// 역삼각형
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("============");

		// 우측정렬 삼각형
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < num; i++) {
			for (int j = num; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
