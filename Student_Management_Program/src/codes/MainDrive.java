package codes;

public class MainDrive {
	public static void main(String[] args) {

		Student std1 = new Student("해리포터", 1980, false, "010-1234-5678", 80, 80);
		Student std2 = new Student("론", 1980, false, "010-5678-1234", 90, 90);
		ForeignStudent fstd1 = new ForeignStudent("그레인저", 1979, true, "010-1234-1234", 100, 99, 100);
		ForeignStudent fstd2 = new ForeignStudent("말포이", 1981, false, "010-5678-5678", 100, 100, 0);

		System.out.println(std1);
		System.out.println(std2);
		System.out.println(fstd1);
		System.out.println(fstd2);

	}
}
