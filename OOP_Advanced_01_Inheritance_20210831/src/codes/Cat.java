package codes;

public class Cat extends Pet {
	
	@Override
	void bark() {
		System.out.println("야웅");
	}
	
	@Override
	public String toString() {
		if(this.isMale) {
			return "이름 : " + this.name + "\n출생 : " + this.birthYear + "\n성별 : 수컷";
			
		}else {
			return "이름 : " + this.name + "\n출생 : " + this.birthYear + "\n성별 : 암컷";
		}
	}
}
