package codes;

import java.util.Scanner;

public class ScoreAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("국어 점수 : ");
		int koreanScore = scanner.nextInt();
		System.out.print("수학 점수 : ");
		int mathScore = scanner.nextInt();
		System.out.print("영어 점수 : ");
		int englishScore = scanner.nextInt();

		int avg = (koreanScore + mathScore + englishScore) / 3;

		if (avg >= 60 && koreanScore >= 40 && mathScore >= 40 && englishScore >= 40) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
