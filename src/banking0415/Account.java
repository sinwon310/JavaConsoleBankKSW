package banking0415;

import java.util.Scanner;

public class Account {
	//계좌번호(String형), 이름(String형), 잔액(int형)
	//3.Account 클래스
	private String accNum;
	private String name;
	private int balance;
	
	
	//4.생성자
	public Account(String accNum, String name, int balance) {
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
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	//12.toString

	@Override
	public String toString() {
		return "계좌번호: " + accNum +"\n"+
				"고객이름: " + name +"\n"+ 
				"잔고: " + balance;
	}
	
	//9.키보드 입력을 위한 인스턴스
			static Scanner scan = new Scanner(System.in);
			//9.계좌정보 저장을 위한 인스턴스배열 생성
			static Account[] accounts = new Account[50];
			//9.개설된 계좌정보 카운트용 변수
			static int accCnt = 0;
			
			// 메뉴출력
			public static void showMenu() {
				System.out.println("1.계좌계설");
				System.out.println("2.입금");
				System.out.println("3.출금");
				System.out.println("4.전체계좌정보출력");
				System.out.println("5.프로그램종료");
			}
			// 계좌개설을 위한 함수
			public static void makeAccount() {
				//10
				System.out.print("계좌번호:");
				String a = scan.nextLine();
				System.out.print("이름:");
				String n = scan.nextLine();
				System.out.print("잔고:");
				int b = scan.nextInt();
				
				//11.신규계좌 생성 및 추가
				Account ac = new Account(a, n, b);
				accounts[accCnt++] = ac;
				System.out.println("신규계좌 개설 완료");
			}
			
			
			// 입    금
			public static void depositMoney() {
				scan.nextLine();
				System.out.print("계좌번호:");
				String accNum1 = scan.nextLine();
				
				boolean isFind = false;
				for(int i=0 ; i<accCnt ; i++) {
					if(accounts[i].getAccNum().equals(accNum1)) {
						System.out.print("입금액:");
						int money = scan.nextInt();
						scan.nextLine();
						
						accounts[i].deposit(money);
						isFind = true;
						break;
					}
				}
				System.out.println("입금이 완료되었습니다.");
				System.out.println("");
			}
			// 출    금
			public static void withdrawMoney() {
				System.out.print("계좌번호:");
				String accNum1 = scan.nextLine();
				
				boolean isFind = false;
				for(int i=0 ; i<accCnt ; i++) {
					if(accounts[i].getAccNum().equals(accNum1)) {
						System.out.print("출금액:");
						int money = scan.nextInt();
						scan.nextLine();
						
						accounts[i].withdraw(money);
						isFind = true;
						break;
					}
				}
				System.out.println("출금이 완료되었습니다");
				System.out.println("");
				
			}
			// 전체계좌정보출력
			public static void showAccInfo() {
				for(int i=0 ; i<accCnt ; i++) {
					//13.toString을 오버라이딩 했으므로 인스턴스를 그대로 출력
					System.out.println(accounts[i]);
				}
				System.out.println("------------");
				System.out.println("전체계좌정보 출력이 완료되었습니다");
				
			}
	
}
