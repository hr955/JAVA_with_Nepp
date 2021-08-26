package codes;

import java.util.Scanner;

public class Condition_Grade {
	public static void main(String[] args) {

		// 학점부여기준 : 90점 이상(추가검사) => 5등 이내 : A+
		// 90점 이상 -> 6등이하 : A0
		// 80점 이상 -> B
		// 70점 이상 -> C
		// 그 외 -> F

		Scanner scanner = new Scanner(System.in);
		

		System.out.print("점수 입력 : ");
		int score = scanner.nextInt();

		// 등수 입력
		System.out.print("등수 입력 : ");
		int rank = scanner.nextInt();

		// 90점 이상인가?
		if (score >= 90) {
			// 등수가 5등 이상인가?
			if (rank <= 5) {
				// 점수가 90점 이상이고 등수가 5등 이내라면 A+
				System.out.println("A+");
			} else {
				System.out.println("A0");
			}

		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}
}
