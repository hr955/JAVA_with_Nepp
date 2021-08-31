package codes;

public class Card {
	String pattern; // 스 하 다 클 등 무늬
	int number; // 2,3,..., K=13, Q=12 등..

	// 공통속성 - 카드의 가로와 세로
	static double width = 5.8;
	static double height = 13.5;

	void printCardInfo() {
		System.out.println("패턴 : " + this.pattern);
		System.out.println("숫자 : " + this.number);
	}

	static void printCardClassInfo() {
		System.out.println("포커 카드에 대한 묘사를 하는 클래스");
		// this, pattern 사용 X
		// static 변수들만 사용가능
	}

}
