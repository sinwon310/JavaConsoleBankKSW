package banking0415;

import java.util.Scanner;

import banking0416.AccountManager;

public class BankingSystemMain {
	
	static Scanner scan = new Scanner(System.in);


	public static void main(String[] args) {
		
		
		while(true) {//2.1번이 실행되는거 보고 while로 묶기
		//메뉴출력(1.틀짜기)
			Account.showMenu();
		System.out.print("메뉴입력:");
		int key = scan.nextInt();
		scan.nextLine();//14.버퍼에 남은 엔터키 제거
		switch(key) {
		//7.case1 > ICustomDefine.make로 바꾸기	
		case ICustomDefine.MAKE:
				//계좌개설
				System.out.println("계좌개설");
				Account.makeAccount();//8
				break;
			case ICustomDefine.DEPOSIT:
				//입금
				System.out.println("입금");
				Account.depositMoney();
				break;
			case ICustomDefine.WITHDRAW:
				//출금
				System.out.println("출금");
				Account.withdrawMoney();
				break;
			case ICustomDefine.INQUIRE:
				//계좌정보출력
				System.out.println("계좌정보출력");
				Account.showAccInfo();
				break;
			case ICustomDefine.EXIT:
				//프로그램종료
				System.exit(0);
				break;
			}//switch 끝
		}//while 끝
	}//main 끝

}//class 끝
