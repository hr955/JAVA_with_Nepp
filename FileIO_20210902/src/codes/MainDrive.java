package codes;

import java.io.*;

public class MainDrive {
	public static void main(String[] args) {

		// writeFile();
		readFile();

	}

	// 파일 저장 기능
	static void writeFile() {
		// 파일 경로 설정
		File myFile = new File("myPhoneBook.txt");

		try {
			// 파일에 실제로 기록을 담당하는 클래스 (FileWriter)
			// default : 내용을 모두 지우고 새로 작성 / true : 기존 내용에 추가
			FileWriter fw = new FileWriter(myFile, true);
			// 한번에 여러 글자를 처리하게 도와주는 클래스 (BufferedWriter)
			BufferedWriter bw = new BufferedWriter(fw);

			// bw를 이용해서 파일에 내용 기록
			bw.append("론 위즐리, 010-5678-5678, 1979");
			bw.newLine();
			bw.close();
			fw.close();

			System.out.println("파일 작성 완료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 파일 읽어오기 기능
	static void readFile() {
		// 파일 경로 설정
		File myFile = new File("myPhoneBook.txt");

		try {
			// 파일의 내용을 읽어오는 클래스 (FileReader)
			FileReader fr = new FileReader(myFile);
			// fr을 한번에 한 문장씩 (String)으로 불러내게 도와주는 클래스
			BufferedReader br = new BufferedReader(fr);

			// 몇줄이 있을지 불명확 -> 무한반복 / 조건이 맞으면 break;
			while (true) {
				String line = br.readLine();

				if (line == null) {
					// 더이상 읽어올 내용이 없는 경우
					break;
				}
				// 읽어올 내용이 있는 경우
				// String 가공
				String[] userInfo = line.split(",");
				String name = userInfo[0];
				String phoneNum = userInfo[1];
				// String -> int 타입캐스팅
				// String birthYear = userInfo[2];
				int birthYear = Integer.parseInt(userInfo[2]);

				System.out.println(String.format("%s(%d년생) : %s", name, birthYear, phoneNum));
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
