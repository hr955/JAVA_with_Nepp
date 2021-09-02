package codes;

public class MainDrive {
	public static void main(String[] args) {

		// 사람1과 변호사 등장
		Human h1 = new Human();
		SmartHuman sh1 = new SmartHuman();

		// h1의 변호사로 sh1을 지정
		h1.setMyLawyer(sh1);

		// 사람1이 고소당함
		h1.goso();

		// 사람2는 법대생을 변호사로 선임
		Human h2 = new Human();
		LawStudent ls1 = new LawStudent();

		h2.setMyLawyer(ls1);
		h2.goso();

		Human h3 = new Human();
		
		// 사람3은 스스로 대처 방안을 변호사로서 세팅
		h3.setMyLawyer(new Lawyer() {

			@Override
			public void defense() {
				System.out.println("h3이 스스로 변호합니다.");
			}

		});

		h3.goso();

	}
}
