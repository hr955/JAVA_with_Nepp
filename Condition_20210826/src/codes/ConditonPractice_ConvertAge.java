package codes;

import java.util.Scanner;

public class ConditonPractice_ConvertAge {

	//성인, 미성년자 판별
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생년도 입력 : ");
		
		//출생년도 사용자 입력
		int birthYear = scanner.nextInt();
		
		scanner.close();
		
		//현재 나이
		int age = 2021 - birthYear + 1;

		//성인,미성년자 판별
		String result = age >= 20 ? "성인" : "미성년자";

		//출력
		System.out.println(result);
	}

}
