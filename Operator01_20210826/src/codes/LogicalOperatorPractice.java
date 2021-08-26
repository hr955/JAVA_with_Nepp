package codes;

public class LogicalOperatorPractice {
	public static void main(String[] args) {
		int score1 = 60;
		int score2 = 50;
		int score3 = 80;
		boolean isPass;

		int average = (score1 + score2 + score3) / 3;

		if (average >= 60) {
			isPass = true;
			System.out.println(isPass);
		}
	}
}
