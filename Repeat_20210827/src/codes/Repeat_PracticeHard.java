package codes;

public class Repeat_PracticeHard {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("[" + i + "," + j + "]");
			}
			System.out.println();
		}

		System.out.println("================================");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					System.out.print("[" + i + "," + j + "]");
				} else {
					System.out.print("     ");
				}

			}
			System.out.println();
		}

		System.out.println("================================");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j == 4) {
					System.out.print("[" + i + "," + j + "]");
					break;
				}
				System.out.print("     ");

			}
			System.out.println();
		}

		System.out.println("================================");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j || i + j == 4) {
					System.out.print("[" + i + "," + j + "]");
				} else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}

		System.out.println("================================");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 0 || i == 4 || j == 4) {
					System.out.print("[" + i + "," + j + "]");
				} else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}

	}

}
