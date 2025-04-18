package banking0414;

import java.util.Scanner;

public class BankingSystemMain {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void menuShow() {
		System.out.println("-----Menu------");
		System.out.println("1.계좌개설");
		System.out.println("2.입	금");
		System.out.println("3.출	금");
		System.out.println("4.전체계좌정보출력");
		System.out.println("5.프로그램종료");
	}

	public static void main(String[] args) {
		
		AccountManager ac = new AccountManager(100);
		
		while(true) {
			//제일 먼저 메뉴를 출력한다
			menuShow();
			//메뉴 입력
			int choice = scan.nextInt();
			//입력을 위한 버퍼(Buffer) 제거
			scan.nextLine();
			//입력받은 정수에 따라 분기해서 각 기능을 실행한다
			switch(choice) {
			case 1:
				ac.makeAccount(choice);
				break;
			case 2:
				ac.depositMoney();
				break;
			case 3:
				ac.withdrawMoney();
				break;
			case 4:
				ac.showAccInfo();
				break;
			case 5:
				System.out.println("프로그램종료");
				return;
			}
		}

	}

}
