package codes;

import codes.datas.Account;

public class MainDrive {
	
	public static void main(String[] args) {
		
		User u1 = new User();
		u1.setName("해리");
		
		Account ac1 = new Account();
		
		ac1.accountNumber = "123-456789-012";
		ac1.setBalance(500000000);
		ac1.owner = u1;
		
		ac1.setBalance(-500000000);
		System.out.println(ac1.getBalance());
		
	}

}
