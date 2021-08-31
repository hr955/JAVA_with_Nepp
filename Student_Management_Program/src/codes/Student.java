package codes;

public class Student {

	String name;
	int birthYear;
	boolean isFemale;
	String parentTel;
	int koreanScore;
	int mathScore;

	// Student 생성자
	public Student(String name, int birthYear, boolean isFemale, String parentTel, int koreanScore, int mathScore) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.isFemale = isFemale;
		this.parentTel = parentTel;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
	}

	// 평균점수 출력
	int avgScore() {
		return (this.koreanScore + this.mathScore) / 2;
	}
	
	//지원가능 대학
	String university() {
		int avgScore = avgScore();

		if (avgScore >= 95) {
			return "최상위권";
		} else if (avgScore >= 90) {
			return "상위권";
		} else if (avgScore >= 80) {
			return "인서울";
		} else {
			return "기타";
		}
	}
	
	@Override
	public String toString() {
		return "이름 : " + this.name + "\n출생 : " + this.birthYear + "년\n평균점수 : " + avgScore() + "점" + "\n지원가능 대학 : "
				+ university() + "\n";
	}

}
