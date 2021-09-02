package codes;

public class Human {
	// 멤버변수로, 변호사(역할-인터페이스)를 둔다.
	Lawyer myLawyer; // 기본값 : null -> 선임한 변호사는 없다.

	// 변호사가 누구인지 지정하는 메소드
	public void setMyLawyer(Lawyer lawyer) {
		// 인터페이스변수 : 해당 역할이 수행 가능한 모든 클래스
		this.myLawyer = lawyer;
	}

	// 고소를 당하는 함수
	void goso() {

		if (this.myLawyer != null) {
			// 1. 내가 선임한 변호사가 있는경우 -> 변호 요청
			this.myLawyer.defense();
		} else {
			// 2. 변호사가 없는경우 -> 직접변호 ( 메소드들을 실행)
			System.out.println("평범한 사람이 직접 고소 대응");
			System.out.println("법정에서 패배");
		}
	}

}
