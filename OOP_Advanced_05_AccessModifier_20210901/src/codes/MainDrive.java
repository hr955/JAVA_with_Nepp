package codes;

import codes.datas.TestClass;

public class MainDrive {
	public static void main(String[] args) {
		// 상속관계 X, 같은 패키지 X (남남)
		TestClass tc1 = new TestClass();

		// 남남이어도 public 변수 접근 가능
		tc1.num1 = 10;

		// protected는 남에게 허용 X
		// tc1.num2;

	}

}
