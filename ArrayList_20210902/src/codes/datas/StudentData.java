package codes.datas;

public class StudentData {

	String name;
	int birthYear;

	public StudentData(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return String.format("%s(%d년생)", this.name, this.birthYear);
	}

	@Override
	public boolean equals(Object obj) {

		// Object 형태 변수 obj = StudentData("해리포터", 1980);
		// Object obj에 들어있는 객체가 StudentData 형태라고 보장할 수 없음
		// 형태가 맞는지 확인 다른 형태의 객체라면 false
		if (!(obj instanceof StudentData)) {
			return false;
		}

		StudentData otherStd = (StudentData) obj;

		if (otherStd.name == this.name && otherStd.birthYear == this.birthYear) {
			return true;
		} else {
			return false;
		}

	}

}
