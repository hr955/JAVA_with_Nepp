package codes;

public class Dog extends Pet {

	void keepHome() {
		System.out.println("강아지가 집을 지킨다.");
	}

	@Override
	void bark() {
		System.out.println("멍멍");
	}

	@Override
	public boolean equals(Object obj) {
		//Object 변수를 타입 캐스팅하여 Dog형태로 변환 (다형성 활용)
		Dog otherDog = (Dog) obj;

		if (this.name == otherDog.name && this.birthYear == otherDog.birthYear) {
			return true;
		} else {
			return false;
		}
	}
}
