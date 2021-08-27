package codes;

import java.util.Scanner;

public class Repeat_Prime {
	public static void main(String[] args) {

		// Q1. 소수 구하기

		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int input = scanner.nextInt();
		boolean isPrimeNum = true;
		int divNum = 0;

		for (int i = 2; i < input / 2; i++) {
			if (input % i == 0) {
				isPrimeNum = false;
				divNum = i;
				break;
			}
		}

		if (isPrimeNum) {
			System.out.println("소수입니다");
		} else {
			System.out.println(divNum + "으로 나뉘어 떨어지므로 소수가 아닙니다.");
		}

		scanner.close();

		// Q2. [2 ~ 입력값] 사이의 모든 소수 출력하기
		
		int primeCnt = 0;
		
		for (int i = 2; i <= input; i++) {

			boolean isIPrimeNumber = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {

					// 한번이라도 들어오면 i는 소수 아님.
					isIPrimeNumber = false;
					break;
				}
			}
			// 내부 for 돌았을 때, i는 소수로 유지되는가?
			if (isIPrimeNumber) {
				System.out.print(i+" ");
				primeCnt++;
			}
		}
		System.out.println();
		System.out.println(primeCnt + "개");
	}
}
