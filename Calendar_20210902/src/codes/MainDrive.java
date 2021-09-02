package codes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainDrive {
	public static void main(String[] args) {

		// 1980년 7월 30일 7시 30분 출생
		// Calendar 타입의 변수를 이용해 저장

		// 자동 세팅값 : 현재 일시
		Calendar myBirthDay = Calendar.getInstance();

		// myBirthDay의 년/월/일/시/분 을 원하는 값으로 바꾸자
		myBirthDay.set(1980, Calendar.JULY, 30, 7, 30);
		
		// 우리가 생각하는 월 : 1 ~ 12
		// Calendar 월 : 0 ~ 11
		
		//분만 -> 18분으로 변경
		myBirthDay.set(Calendar.MINUTE, 18);
		
		System.out.println("요일 : " + myBirthDay.get(Calendar.DAY_OF_MONTH));
		
		Calendar friendsbirthDay = Calendar.getInstance();
		friendsbirthDay.set(1991, Calendar.MAY, 22);
		
		//친구와 본인중에 누가 더 먼저 태어났나?
		//1970년 1월 1일 기준 ~ 1980년 7월 30일 까지 흐른시간 -> 더 작음 (먼저 태어남)
		//1970년 1월 1일 기준 ~ 1991년 5월 22일 까지 흐른시간
		if(myBirthDay.getTimeInMillis() >= friendsbirthDay.getTimeInMillis()) {
			//친구가 먼저 태어남
			System.out.println("친구가 먼저");
		}else {
			//내가 먼저 태어남
			System.out.println("내가 먼저");
		}
		
		//출생년월일을 출력 -> "1980년 7월 30일 오전 7시 30분" 으로 가공해서 출력
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 a h시 mm분");
		
		System.out.println(sdf.format(myBirthDay.getTime()));
		
	}

}
