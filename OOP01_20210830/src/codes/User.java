package codes;

public class User {

	String name;
	int point;
	int birthYear;

	// 한국 나이 계산 메소드
	int getKoreanAge(int year) {
		int age = year - this.birthYear + 1;

		return age;
	}

	// 정보 출력 메소드
	void printUserInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("보유 포인트 : " + this.point);
		System.out.println("나이 : " + this.getKoreanAge(2021) + "세");
	}

}
