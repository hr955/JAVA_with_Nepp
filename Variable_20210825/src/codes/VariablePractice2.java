package codes;

public class VariablePractice2 {
	public static void main(String[] args) {
		
		//Q. num1과 num2의 값을 서로 바꾸기
		int num1 = 50;
		int num2 = 20;
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
