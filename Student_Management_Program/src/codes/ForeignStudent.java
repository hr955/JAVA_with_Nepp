package codes;

public class ForeignStudent extends Student {

	// Student 상속
	// 해외유학 학생은 영어점수 추가
	int englishScore;

	public ForeignStudent(String name, int birthYear, boolean isFemale, String parentTel, int koreanScore,
			int mathScore, int englishScore) {
		super(name, birthYear, isFemale, parentTel, koreanScore, mathScore);
		this.englishScore = englishScore;
	}

	// 평균점수 출력
	@Override
	int avgScore() {
		return (this.koreanScore + this.mathScore + this.englishScore) / 3;
	}

	@Override
	public String toString() {
		return "이름 : " + this.name + "\n출생 : " + this.birthYear + "년\n평균점수 : " + avgScore() + "점" + "\n지원가능 대학 : "
				+ university() + "\n";
	}

}
