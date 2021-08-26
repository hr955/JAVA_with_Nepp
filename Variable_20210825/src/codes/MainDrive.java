package codes;

public class MainDrive {

	public static void main(String[] args) {

		// 변수 특이사항
		// 1.만들고 나서 사용해야함
		int num;

		// 2. 이름 중복 X

		// 3. 변수에 들어있는 데이터는 변경이 가능
		num = 20;
		System.out.println(num);

		// 4. 변수의 값을 고정 : final
		final double PI = 3.14;
		// PI = 20;

		// 5.변수 데이터/자료형 일치
		int myAge = 34;
		//myAge = 34.5;

		float myHeight = 180.3f;
		double myWeight = 80;  //double은 int값을 받아줌
		
		String myName = "장독대";
		boolean isMale = false;

		System.out.println(myAge);
		System.out.println(myName);
		System.out.println(myHeight);
		System.out.println(isMale);

	}
}
