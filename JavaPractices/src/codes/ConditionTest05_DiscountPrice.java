package codes;

import java.util.Scanner;

public class ConditionTest05_DiscountPrice {

	// 할인 금액 계산기
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("구매 금액 : ");
		int totalPrice = scanner.nextInt();
		double discountPrice;

		scanner.close();

		// 1. 할인 금액
		if (totalPrice < 10000) {
			discountPrice = 0;
		} else if (totalPrice < 50000) {
			discountPrice = totalPrice * 0.05;
		} else if (totalPrice < 100000) {
			discountPrice = totalPrice * 0.1;
		} else {
			discountPrice = totalPrice * 0.2;
		}

		System.out.println("할인 금액 : " + discountPrice + "원");

		// 2. 누진세
		discountPrice = 0;

		if (totalPrice < 10000) {
			discountPrice = 0;
		} else {
			if (totalPrice < 50000) {
				discountPrice = (int) (totalPrice * 0.05);
			} else {
				if (totalPrice < 100000) {
					discountPrice = 40000 * 0.05 + (totalPrice - 50000) * 0.1;

				} else {
					discountPrice = 40000 * 0.05 + 50000 * 0.1 + (totalPrice - 100000) * 0.2;
				}
			}
		}

		// 3. 누진세 복잡한 경우부터 계산

		if (totalPrice >= 100000) {
			discountPrice = 40000 * 0.05 + 50000 * 0.1 + (totalPrice - 100000) * 0.2;
		} else if (totalPrice >= 50000) {
			discountPrice = 40000 * 0.05 + (totalPrice - 50000) * 0.1;
		} else if (totalPrice >= 10000) {
			discountPrice = (int) (totalPrice * 0.05);
		} else {
			discountPrice = 0;
		}

	}

}
