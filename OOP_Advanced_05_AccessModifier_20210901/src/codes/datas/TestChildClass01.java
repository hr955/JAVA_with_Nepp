package codes.datas;

// 테스트 클래스의 자녀 1
// 상속관계 O + 같은집 O (같은 패키지)

public class TestChildClass01 extends TestClass {

	void test() {
		// 같은 패키지에 있는, 부모 클래스
		TestClass tc = new TestClass();

		// public
		tc.num1 = 10;

		// protected - 자식이어서 접근가능 X, 같은 패키지에 있다면, 변수를 통해 접근 O
		tc.num2 = 20;
		// 같은 패키지라면 상속을 물려준다
		this.num2 = 20;

		// default - 같은 패키지라면 변수를 통해 접근 O
		tc.num3 = 30;
		// 같은 패키지라면 상속을 물려준다
		this.num3 = 30;
		
		//private
		//this.num4 -> 에러
	}

}
