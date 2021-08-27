package codes;

import java.util.Scanner;

public class Repeat_LCM_GCD {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("두개의 숫자 입력 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		scanner.close();

		// 최소 공배수
		int lcm = num1;

		while (true) {
			if (lcm % num1 == 0 && lcm % num2 == 0) {
				System.out.println("최소 공배수 : " + lcm);
				break;
			}

			lcm++;
		}

		// 최대 공약수
		int gcd = 0;
		for (int i = num2; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.println("최대 공약수 : " + gcd);

	}

}
