package codes;

public class MainDrive {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.birthYear = 2014;
		dog1.name = "바둑이";
		dog1.isMale = true;

		Dog dog2 = new Dog();
		dog2.birthYear = 2014;
		dog2.name = "바둑이";
		dog2.isMale = true;
		
		dog1.bark();
		
		Cat cat1 = new Cat();
		cat1.name = "야통";
		cat1.birthYear = 2014;
		cat1.isMale = true;
		
		cat1.bark();
		
		System.out.println(dog1.equals(dog2));
		System.out.println(cat1);
		
	}
}
