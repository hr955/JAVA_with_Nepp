package codes;

import java.util.Scanner;

public class Array_Practice_NumberBaseball {
	public static void main(String[] args) {

		// 문제로 출제될 숫자들이 담길 배열
		int[] questionNumArr = new int[3];

		// 3자리 문제 출제
		for (int i = 0; i < questionNumArr.length; i++) {

			// 모든 조건을 만족하는 숫자가 나올때까지 반복
			while (true) {

				// 1~9 사이의 난수 생성
				int randonNum = (int) (Math.random() * 9) + 1;

				boolean isDuplOk = true;

				// 중복 검사
				for (int num : questionNumArr) {
					if (num == randonNum) {
						// 중복 발견
						isDuplOk = false;
						break;

					}
				}

				// 중복 검사를 통과했다면 배열에 담아줌
				if (isDuplOk) {
					questionNumArr[i] = randonNum;
					break;
				}

			}

		}

		for (int num : questionNumArr) {
			System.out.print(num + " ");
		}

		Scanner scanner = new Scanner(System.in);

		// 사용자 입력값
		int[] inputNumArr = new int[3];

		while (true) {
			System.out.print("3자리 숫자 입력");
			int input = scanner.nextInt();

			// 입력받은 세자리 숫자를 자릿수별로 쪼개 배열에 입력
			// 356 -> arr[0] = 3, arr[1] = 5, arr[2] = 6
			inputNumArr[0] = input / 100;
			inputNumArr[1] = input / 10;
			inputNumArr[2] = input % 10;
		}

		scanner.close();

	}

}
