package codes;

public class ArrayPractice {
	//1~100 사이의 홀수 저장 배열 만들기
	public static void main(String[] args) {
		int[] arr = new int[50];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2 + 1;
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
