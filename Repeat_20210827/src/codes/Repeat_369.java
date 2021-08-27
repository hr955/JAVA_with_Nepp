package codes;

import java.util.Scanner;

public class Repeat_369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int firstInput = scanner.nextInt();
		int inputCopy = firstInput;
		boolean isChecked = true;

		while (inputCopy > 0) {
			if (inputCopy % 10 == 3 || inputCopy % 10 == 6 || inputCopy % 10 == 9) {
				System.out.print("짝! ");
				isChecked = false;
			}
			inputCopy /= 10;
		}

		if (isChecked) {
			System.out.print(firstInput);
		}

	}

}
