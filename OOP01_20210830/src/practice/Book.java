package practice;

public class Book {

	String title;
	int rentFee;
	int limitAge;

	// 대여자
	User rentUser;

	// 책 정보 출력
	void printBookInfo() {
		System.out.println("제목 : " + this.title);
		System.out.println("대여료 : " + this.rentFee);
		System.out.println("연령제한 : " + this.limitAge);

		// 대여가능 여부에 따라 상태를 다르게 출력
		if (this.rentUser != null) {
			// 대여자가 있는 경우
			System.out.println("상태 : 대여 불가능 (" + this.rentUser.name + "(이)가 대여한 상태입니다.)");
		} else {
			// 대여 가능한 경우
			System.out.println("상태 : 대여 가능");
		}
		
		System.out.println();
	}
	
	// 책 반납 getBack()
}
