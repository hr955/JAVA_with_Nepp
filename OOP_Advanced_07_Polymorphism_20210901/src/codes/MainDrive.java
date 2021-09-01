package codes;

import codes.datas.SmartTv;
import codes.datas.Tv;
import codes.datas.VideoTv;

public class MainDrive {
	public static void main(String[] args) {

		// 다형성 - 같은 종류 변수, 다른 종류 인스턴스.

		// Tv 변수에 Tv 객체를 담아두자.
		Tv tv1 = new Tv();
		// Tv 변수에 Video 객체 담기
		Tv tv2 = new VideoTv();
		// Tv 변수에 SmartTv 객체 담기
		Tv tv3 = new SmartTv();
		
		Object obj = new Tv();
		Object obj2 = new VideoTv();
		Object obj3 = new SmartTv();
		
		// tv2, tv3 실체는 자녀 클래스
		// tv2의 녹화기능 사용? -> Tv 형태 tv2를 -> 다시 VideoTv 형태로 돌리자
		VideoTv temp = (VideoTv) tv2;
		temp.recordVideo();

		// tv1 켜기
		tv1.turnOnTv();

		// tv2 켜기
		tv2.turnOnTv();
		// tv2 녹화기능? -> 불가능

		// tv3 켜기
		tv3.turnOnTv();

	}
}
