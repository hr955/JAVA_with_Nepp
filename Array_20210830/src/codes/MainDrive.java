package codes;

public class MainDrive {
	public static void main(String[] args) {
		// 배열을 생성 -> "어떤 종류"의 데이터 "목록"

		// 정수 100개 저장 배열
		int[] numbers = new int[100];

		// 학생 이름 12개 저장 배열
		String[] studentNames = new String[12];

		// numbers 배열의 맨 앞칸에 10, 맨 뒷칸에 50
		numbers[0] = 10;
		numbers[99] = 50;

		studentNames[0] = "학생1";
		studentNames[11] = "학생12";

		System.out.println(numbers[0]);
		System.out.println(numbers[99]);

		// numbers의 10번칸에는 어떤값? -> "0"
		System.out.println(numbers[10]);

		System.out.println(studentNames[0]);
		System.out.println(studentNames[11]);

		// studentNames의 5번칸에는 어떤값? -> "null"
		System.out.println(studentNames[5]);

		// 배열의 초기화
		int[] lottoNumbers = { 1, 7, 15, 32, 45, 50 };
		int lottoNumbers2[] = { 1, 7, 15, 32, 45, 50 };

		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.print(lottoNumbers[i] + " ");
		}
		System.out.println();

		// 연습문제. 200개의 정수를 저장하는 배열 생성 후 차례대로 숫자 대입
		int[] numberArr = new int[50];

		for (int i = 0; i < numberArr.length; i++) {
			numberArr[i] = i + 1;
		}

		// for-each문
		for (int num : numberArr) {
			System.out.print(num + " ");
		}

		System.out.println();

		// for문으로 -> numberArr에 들어있는 값들을 모두 출력
		for (int i = 0; i < numberArr.length; i++) {
			System.out.print(numberArr[i] + " ");
		}

	}

}
