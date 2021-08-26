package codes;

import java.util.Scanner;

public class ConditionTest02_FahrenheitConverter {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("섭씨 온도 : ");
		double celsius = scanner.nextDouble();
		double fahrenheit = celsius * 1.8 + 32;

		System.out.println("화씨 온도 : " + fahrenheit);

	}
}
