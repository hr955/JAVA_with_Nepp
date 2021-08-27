package codes;

import java.util.Scanner;

public class Repeat_Practice2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("입력 : ");
		int num = scanner.nextInt();
		int result = 0;

		scanner.close();

		for (int i = 1; i <= num; i++) {
			result += i;
		}
		
		System.out.println(result);

	}

}
