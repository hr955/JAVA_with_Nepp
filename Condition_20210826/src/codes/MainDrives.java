package codes;

import java.util.Scanner;

public class MainDrives {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		
		int userAge = myScanner.nextInt();
		
		myScanner.close();
		
		if (userAge >= 20) {
			System.out.println("성인");
		} else if (userAge >= 17) {
			System.out.println("고등학생");
		} else {
			System.out.println("미성년자");
		}

	}
}
