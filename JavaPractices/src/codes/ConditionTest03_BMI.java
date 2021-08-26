package codes;

import java.util.Scanner;

public class ConditionTest03_BMI {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("키 : ");
		double height = scanner.nextDouble();

		System.out.print("몸무게 : ");
		double weight = scanner.nextDouble();

		double bmi = weight / Math.pow((height / 100), 2);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}

		scanner.close();
	}

}
