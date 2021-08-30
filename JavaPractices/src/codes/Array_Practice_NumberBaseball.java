package codes;

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
				
				//중복 검사를 통과했다면 배열에 담아줌
				if (isDuplOk) {
					questionNumArr[i] = randonNum;
					break;
				}

			}

		}

	}

}
