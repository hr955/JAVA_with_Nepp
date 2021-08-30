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
		System.out.println();

		Scanner scanner = new Scanner(System.in);

		// 사용자 입력값
		int[] inputNumArr = new int[3];

		while (true) {
			System.out.print("3자리 숫자 입력 : ");
			int input = scanner.nextInt();

			// 입력받은 세자리 숫자를 자릿수별로 쪼개 배열에 입력
			// 356 -> arr[0] = 3, arr[1] = 5, arr[2] = 6
			inputNumArr[0] = input / 100;
			inputNumArr[1] = (input / 10) % 10;
			inputNumArr[2] = input % 10;

			// 입력값과 정답 비교 : ? S, ? B
			int strikeCnt = 0;
			int ballCnt = 0;

			// 입력값과 정답이 일치하는지 검토
			for (int i = 0; i < inputNumArr.length; i++) {
				for (int j = 0; j < questionNumArr.length; j++) {
					// 입력값과 정답이 일치하는 경우
					if (inputNumArr[i] == questionNumArr[j]) {
						// index도 일치하는지 확인
						if (i == j) {
							// index가 일치하면 strike
							strikeCnt++;
						} else {
							// 정답은 일치하지만 index가 다르다면 ball
							ballCnt++;
						}
					}
				}
			}

			System.out.println(strikeCnt + "S, " + ballCnt + "B");

			if (strikeCnt == 3) {
				System.out.println("정답입니다!");
				break;
			}
		}

		scanner.close();

	}

}
