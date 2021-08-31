package codes;

public class MainDrive {
	public static void main(String[] args) {
		MyTestClass mtc = new MyTestClass();
		
		mtc.doTest();
		mtc.doTest(1);
		mtc.doTest("test");
		mtc.doTest(1, "test");
		
	}
}
