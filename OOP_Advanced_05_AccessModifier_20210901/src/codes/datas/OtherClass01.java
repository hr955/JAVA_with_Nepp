package codes.datas;

// 상속관계X, 같은 패키지 O

public class OtherClass01 {
	
	void test() {
		TestClass tc = new TestClass();
		
		//protected - 같은 패키지여서 변수로 접근 O
		//this.num2 -> 에러
		tc.num2 = 10;
		
		//default - 같은 패키지라면 변수로 접근 O
		tc.num3 = 30;
		
	}
	
}
