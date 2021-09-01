package codes.datas;

public class TestClass {
	
	public int num1;
	protected int num2;
	int num3; // default
	private int num4;
	
	void test() {
		//내 자신 안에서만 이용 가능
		this.num4 = 20;
	}

}
