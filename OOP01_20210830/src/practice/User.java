package practice;

public class User {

	String name;
	int birthYear;
	int point;

	// 책을 빌려가는 기능
	boolean rentBook(Book book) {

		// 1. 빌려갈 포인트가 충분한가?
		boolean isPointOk = this.point >= book.rentFee;

		// 2. 빌려가도 되는 나이인가?
		boolean isAgeOk = this.getKoreanAge() >= book.limitAge;

		// 3. 책이 대여 가능한 상태인가?
		boolean isBookStautsOk = book.rentUser == null;

		if (isPointOk && isAgeOk && isBookStautsOk) {
			// 모든 조건을 충족하면 대여 가능

			// 대여 후 데이터 처리
			this.point -= book.rentFee;
			// 대여한 사람이 '나' 임을 등록
			book.rentUser = this;

			return true;

		} else {
			// 셋중 하나라도 충족하지 못하면 대여 불가능

			if (!isPointOk) {
				System.out.println("포인트가 부족합니다.");
			} else if (!isAgeOk) {
				System.out.println("연령이 제한되었습니다.");
			} else {
				System.out.println("이미 대여된 책입니다.");
				System.out.println("대여자 : " + book.rentUser.name);
			}

			return false;
		}
	}

	int getKoreanAge() {
		return 2021 - birthYear + 1;
	}

}
