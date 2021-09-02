package codes;

import java.util.ArrayList;
import java.util.List;

import codes.datas.StudentData;

public class MainDrive {
	public static void main(String[] args) {
		List<StudentData> studentList = new ArrayList<>();

		studentList.add(new StudentData("해리포터", 1980));
		studentList.add(new StudentData("헤르미온느", 1979));

		// toString Override
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).toString());
		}

		// equal Override
		if (studentList.contains(new StudentData("해리포터", 1980))) {
			System.out.println("있음");
		} else {
			System.out.println("없음");
		}

		// 원하는 데이터의 인덱스 찾기
		System.out.println(studentList.indexOf(new StudentData("해리포터", 1980)));

		// 데이터 제거
		StudentData removedStd = studentList.remove(0);
		System.out.println(removedStd);

		studentList.clear();

		// List<int> selectedWeekdays = new ArrayList<>(); -> 에러
		List<Integer> selectedWeekdays = new ArrayList<>();

		selectedWeekdays.add(1);

		String thisYearStr = "2021";

		System.out.println(Integer.parseInt(thisYearStr) + 20);

	}

}
