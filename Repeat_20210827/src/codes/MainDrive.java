package codes;

public class MainDrive {
	public static void main(String[] args) {

		int num = 1;

		while (num < 10) {
			System.out.println(num++);

		}
		
		System.out.println("===============");
				
		num = 0;
		while (num < 5) {
			System.out.println("안녕하세요");
			num++;
		}
		
		System.out.println("===============");
		
		num = 20;
		while (num > 10) {
			System.out.println(num--);
		}
		
		System.out.println("===============");

		num = 0;
		while (num < 21) {
			System.out.println(num);
			num += 2;
		}

	}

}
