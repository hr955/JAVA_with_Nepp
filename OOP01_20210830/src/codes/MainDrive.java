package codes;

// 책방 관리 프로젝트

public class MainDrive {
	public static void main(String[] args) {

		// User 클래스를 객체화
		User u1 = new User();

		u1.name = "해리";
		u1.birthYear = 1980;
		u1.point = 10000;

		User u2 = new User();

		u2.name = "헤르미온느";
		u2.birthYear = 1979;
		u2.point = 20000;

		// Book 클래스를 객체화
		Book b1 = new Book();

		b1.title = "해리포터";
		b1.limitAge = 7;
		b1.rentFee = 1000;

		// Book 메소드 사용
		b1.printBookInfo();

		Book b2 = new Book();

		b2.title = "반지의 제왕";
		b2.limitAge = 15;
		b2.rentFee = 500;

		b2.printBookInfo();

		// 사용자 정보 출력 기능
		u1.printUserInfo();
		u2.printUserInfo();

		// 해리포터를 빌려간사람은 헤르미온느
		b1.rentUser = u2;

		// 책 반납등의 이유로, 해리포터를 빌려간 사람이 없어졌다.
		b1.rentUser = null;

	}
}
