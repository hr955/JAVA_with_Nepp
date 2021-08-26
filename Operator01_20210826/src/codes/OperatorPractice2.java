package codes;

public class OperatorPractice2 {
	public static void main(String[] args) {
		
		double startMoney = 100000;
		double nowMoney = 115000;
		double rate = (nowMoney - startMoney) / startMoney * 100;

		System.out.println("수익률 = " + rate + "%");
	}
}
