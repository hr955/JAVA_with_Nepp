package codes.datas;

public class Human extends Animal implements Student, TaxPayer, Worker {

	@Override
	public void doStudy() {
		System.out.println("사람이 학생으로서 공부를 합니다.");
	}

	@Override
	public void goToSchool() {
		System.out.println("사람이 학생으로서 학교에 갑니다.");
	}

	@Override
	public void payTax() {
		System.out.println("사람이 납세자로서 세금을 냅니다.");
	}

	@Override
	public void goToWork() {
		System.out.println("사람이 근로자로서 일하러 갑니다.");
	}

	@Override
	public void workHard() {
		System.out.println("사람이 근로자로서 열심히 일합니다.");
	}

}
