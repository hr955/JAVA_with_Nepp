package codes;

import java.util.Scanner;

public class ConditonPractice_ConvertAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생년도 입력 : ");
		int birthYear = scanner.nextInt();

		int age = 2021 - birthYear + 1;

		String result = age >= 20 ? "성인" : "미성년자";

		System.out.println(result);
	}

}
