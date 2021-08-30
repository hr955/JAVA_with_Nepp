package codes;

import java.util.Scanner;

public class Array_Practice_Lotto {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 사용자 입력을 저장할 배열
		int[] inputNumbers = new int[6];

		// 사용자에게 6개의 숫자를 입력받음
		for (int i = 0; i < inputNumbers.length; i++) {

			// 사용자 입력값 중 중복 제거, 1~45 범위 내 숫자인지 판별
			while (true) {

				System.out.print((i + 1) + "번째 숫자 입력 : ");
				int inputNum = scanner.nextInt();

				boolean isDuplOk = true;
				boolean isRangeOk = (inputNum >= 1) && (inputNum <= 45);

				// 중복 판별
				for (int num : inputNumbers) {
					if (num == inputNum) {
						// 중복되는 숫자가 발견되면 isDuplOk = false
						isDuplOk = false;
						break;
					}
				}

				// 범위내 숫자인지 판별
				if (isRangeOk && isDuplOk) {
					inputNumbers[i] = inputNum;
					break;
				} else {
					if (!isRangeOk) {
						// 범위내 숫자가 아닌 경우
						System.out.print("범위를 벗어난 숫자입니다. ");
					} else {
						// 중복된 값을 입력했을 경우
						System.out.print("중복된 숫자입니다. ");
					}
					System.out.print("다시 입력해주세요.");
					System.out.println();
				}

			}

		}

		int[] randomNumbers = new int[6];

		// 6개의 난수를 생성하여 배열에 저장
		for (int i = 0; i < randomNumbers.length; i++) {
			while (true) {
				// Math.random() = 0 ~ 0.99999999
				// Math.randon() = 0 ~ 49.9999999
				int randomNum = (int) ((Math.random() * 45) + 1);
				boolean isDuplOk = true;

				// 중복 검사
				for (int num : randomNumbers) {
					if (num == randomNum) {
						isDuplOk = false;
						break;
					}
				}

				if (isDuplOk) {
					randomNumbers[i] = randomNum;
					break;
				}
			}
		}

		// 버블정렬 (작은 숫자부터 차례대로 정렬)
		for (int i = 0; i < randomNumbers.length; i++) {
			for (int j = 0; j < randomNumbers.length - 1; j++) {
				if (randomNumbers[j] > randomNumbers[j + 1]) {
					int temp = randomNumbers[j];
					randomNumbers[j] = randomNumbers[j + 1];
					randomNumbers[j + 1] = temp;
				}
			}
		}
		
		for(int num : randomNumbers) {
			System.out.print(num + " ");
		}

		int bonusNumber = 0;

		// 보너스 번호 중복검사
		while (true) {
			bonusNumber = (int) ((Math.random() * 45) + 1);

			boolean isDuplOk = true;
			for (int num : randomNumbers) {
				if (num == bonusNumber) {
					// 중복 발견
					isDuplOk = false;
					break;
				}
			}
			if (isDuplOk) {
				break;
			}
		}
		
		System.out.print("+ " + bonusNumber);
		System.out.println();

		// 당첨 확인
		int correctNumCnt = 0;

		// 사용자 입력값과 난수가 일치하면 correctNumCnt++
		for (int inputNum : inputNumbers) {
			for (int randomNum : randomNumbers) {
				if (inputNum == randomNum) {
					correctNumCnt++;
				}
			}
		}

		//등수 확인
		if (correctNumCnt == 6) {
			System.out.println("1등");
		} else if (correctNumCnt == 5) {

			boolean isCorrectBonus = false;

			// 보너스 번호 일치 여부 판별
			for (int num : inputNumbers) {
				if (bonusNumber == num) {
					isCorrectBonus = true;
					break;
				}
			}

			if (isCorrectBonus) {
				System.out.println("2등");
			} else {
				System.out.println("3등");
			}
		} else if (correctNumCnt == 4) {
			System.out.println("4등");
		} else if (correctNumCnt == 3) {
			System.out.println("5등");
		} else {
			System.out.println("낙첨");
		}

	}
}
