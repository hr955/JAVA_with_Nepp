package codes;

import java.util.Scanner;

public class ConditionPractice {
	
	//짝수 홀수 판단
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int input = scanner.nextInt();
		
		scanner.close();

		String result = input % 2 == 0 ? "짝수" : "홀수";

		System.out.println(result);
	}
}
