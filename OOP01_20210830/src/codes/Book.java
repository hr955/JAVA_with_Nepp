package codes;

public class Book {

	// 멤버변수 -> 클래스 바로 밑에 하위정보로 달아주는 변수
	// Book의 하위 정보 -> 제목: String / 제한연령: int / 대여비: int
	String title;
	int limitAge;
	int rentFee;

	// 책의 정보를 출력해주는 메소드 -> 출력만, return X
	void printBookInfo() {
		System.out.println("제목 : " + this.title);
		System.out.println("연령제한 : " + this.limitAge + "세 이용가");
		System.out.println("대여료 : " + this.rentFee + "원");
	}

}
