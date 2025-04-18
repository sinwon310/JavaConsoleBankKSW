package bank.schema;

public class Account {
	//계좌번호(String형), 이름(String형), 잔액(int형)
	//3.Account 클래스
	private String accNum;
	private String name;
	private int balance;
	
	
	//4.생성자
	public Account(String accNum, String name, int balance) {
		super();
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
	}
	
	//4.게터/세터
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	//12.toString

	@Override
	public String toString() {
		return "Account [계좌번호=" + accNum + 
				", 이름=" + name + 
				", 잔고=" + balance + "]";
	}
	
	
	
}
