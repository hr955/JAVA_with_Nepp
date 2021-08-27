package codes;

import java.util.Scanner;

public class Repeat_Sum {
	public static void main(String[] args) {
		
		// 모든 자리의 숫자 합 계산하기

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int input = scanner.nextInt();
		int result = 0;
		
		scanner.close();

		while (true) {
			result += input % 10;
			input /= 10;

			if (input == 0) {
				break;
			}
		}
		System.out.println(result);

	}

}
