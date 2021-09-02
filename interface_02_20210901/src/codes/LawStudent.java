package codes;

// 법대생, 아마추어 -> 변호사 가능, 변호 잘 못함.

public class LawStudent implements Lawyer {

	@Override
	public void defense() {
		System.out.println("아마추어 법대생이 변호합니다.");
		System.out.println("법정에서 무승부로 끝났습니다.");
	}

}
