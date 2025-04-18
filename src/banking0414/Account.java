package banking0414;

public class Account {
	
	public String accountNum;
	public String name;
	public int balance;
	
	public Account(String a, String b, int c) {
		this.accountNum = a;
		this.name = b;
		this.balance = c;
	}
	
	public void deposit(int depMoney) {
		balance += depMoney;
	}
	
	public void withdraw(int withMoney) {
		if(balance<withMoney) {
			System.out.println("잔액이 부족합니다");
		}
		else{
			balance -= withMoney;}
	}
	
	void showAccInfo() {
		System.out.println("***계좌정보출력***");
		System.out.println("---------");
		System.out.println("계좌번호 : "+accountNum);
		System.out.println("고객이름 : "+name);
		System.out.println("잔고 : "+ balance);
		System.out.println("---------");
		System.out.println("전체계좌정보 출력이 "
				+ "완료되었습니다");
	}

}
