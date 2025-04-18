package banking0414;

import java.util.Scanner;

public class AccountManager {
	
	public static Scanner scan = new Scanner(System.in);
	
	private Account[] account;
	int numOfAccount;
	String accountNum, name;
	int depMoney;
	int withMoney;
	int balance;
	
	public AccountManager(int a) {
		account = new Account[a];
		numOfAccount = 0;
	}
	
	public void makeAccount(int choice) {
		
		System.out.println("***신규계좌개설***");
		System.out.print("계좌번호:");accountNum = AccountManager.scan.nextLine();
		System.out.print("고객이름:");name = AccountManager.scan.nextLine();
		System.out.print("잔고:");balance = AccountManager.scan.nextInt();
		scan.nextLine();
		account[numOfAccount++] = new Account(accountNum, name, balance);
		System.out.println("계좌계설이 완료되었습니다.");
		
	}
	
	public void depositMoney() {
		
		System.out.println("***입 금***");
		System.out.println("계좌번호와 입금할 금액을 입력하세요");
		System.out.print("계좌번호:");accountNum = AccountManager.scan.nextLine();
		System.out.print("입금액:");depMoney= AccountManager.scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < numOfAccount; i++) {
	        if (account[i].accountNum.equals(accountNum)) {
	            account[i].deposit(depMoney);
	            System.out.println("입금이 완료되었습니다.");
	            return;
	        }
		}
		System.out.println("계좌번호를 찾을 수 없습니다.");
		
	}
	
	public void withdrawMoney() {
		
		System.out.println("***출   금***");
		System.out.println("계좌번호와 출금할 금액을 입력하세요");
		System.out.print("계좌번호:");accountNum = AccountManager.scan.nextLine();
		System.out.print("출금액:");withMoney= AccountManager.scan.nextInt();
		scan.nextLine();
		balance -= withMoney;
		System.out.println("출금이 완료되었습니다.");
		
		
		for (int i = 0; i < numOfAccount; i++) {
	        if (account[i].accountNum.equals(accountNum)) {
	            account[i].withdraw(withMoney); // 실제 계좌에서 출금
	            System.out.println("출금이 완료되었습니다.");
	            return;
	        }
	    }
	    System.out.println("계좌번호를 찾을 수 없습니다.");

	}
	
	public void showAccInfo() {
		
		for(int i=0 ; i<numOfAccount ; i++) {
			account[i].showAccInfo();
		}
	}

}
