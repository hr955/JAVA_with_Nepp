package codes;

public class MyTestClass {
	
	void doTest() {
		System.out.println("리턴 X 파라미터 X");
	}
	
	void doTest(int num) {
		System.out.println("리턴 X int 파라미터 O");
	}
	
	void doTest(String s) {
		System.out.println("리턴 X String 파라미터 O");
	}
	
	void doTest(int num, String s) {
		System.out.println("리턴 X int, String 파라미터 O");
	}

}
