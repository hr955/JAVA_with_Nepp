package codes;

public class StudentData {

	// 멤버변수들
	String name;
	int birthYear;
	String address;

	// 생성자를 커스터마이징
	public StudentData(String inputName, int inputBirthYear, String inputAddress) {
		this.name = inputName;
		this.birthYear = inputBirthYear;
		this.address = inputAddress;
	}
	
	// 추가(보조) 생성자 작업
	public StudentData() {
		//아무 일도 하지않는 생성자 => "이름 모름", -1, "거주지 불명"의 디폴트값 세팅
		this("이름 모름", -1, "거주지 불명");
	}

	public StudentData(String name) {
		super();
		this.name = name;
	}

}
