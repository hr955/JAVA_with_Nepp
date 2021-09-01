package codes.other_datas;

import codes.datas.TestClass;

// 상속관계 O, 같은 패키지 X

public class TestChildClass02 extends TestClass {

	void test() {

		TestClass tc = new TestClass();

		// public
		tc.num1 = 10;

		// protected - 상속을 받아와서, 내 자료로 사용 O
		// 패키지가 달라 변수로 접근 X : tc.num2 -> 에러
		this.num2 = 20;
		
		// default - 패키지가 다르면 자녀여도 변수 접근 X, 물려주기 X
		//tc.num3 = 30; -> 에러
		//this.num3 = 30; -> 에러

	}

}
