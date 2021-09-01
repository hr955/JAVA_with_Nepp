package codes.datas;

import codes.User;

public class Account {

	public String accountNumber;
	private long balance;
	public User owner;

	// 잔고를 세팅하는 메소드를 별도로 추가 -> 어디서든 사용 할 수 있게 열어줌
	public void setBalance(long balance) {
		// 추가작업 가능
		System.out.println("현재시간 - ??");
		System.out.println("어느 IP ??");

		this.balance = balance;
	}
	
	//잔고를 보여주는 (조회하는) 함수
	public long getBalance() {
		return this.balance;
	}
}
