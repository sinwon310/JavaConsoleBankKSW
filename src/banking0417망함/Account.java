package banking0417망함;

import java.util.Scanner;

public abstract class 
Account {
	//계좌번호(String형), 이름(String형), 잔액(int형)
	//3.Account 클래스
	private String accNum;
	private String name;
	private int balance;
	protected double interest;
	protected String credit;
	
	//4.생성자
	public Account(String accNum, String name, 
			int balance, double interest) {
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
		this.interest = interest;
	}
	public Account(String accNum, String name,
			int balance, double interest, String credit) {
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
		this.interest = interest;
		this.credit = credit;
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
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit (String credit) {
		this.credit = credit;
	}
	public void calNInterest(int money) {
		this.balance +=(int)(balance * getInterest()/100)
				+ money;
	}
	public void calHInterest(int money) {
		double z=0;
		switch(getCredit()) {
		case "A":
			z = 7;
			break;
		case "B":
			z=4;
			break;
		case "C":
			z=2;
			break;
		default:
			System.out.println("신용등급을 잘못입력하였습니다");
		}
		this.balance += (int)(balance*getInterest()/100)
				+ (int)(balance*z/100)+money;
	}
	
	//12.toString

	@Override
	public String toString() {
		return "계좌번호: " + accNum +"\n"+
				"고객이름: " + name +"\n"+ 
				"잔고: " + balance;
	}
	
	
	
}
