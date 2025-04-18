package banking0417망함;

import java.util.InputMismatchException;
import java.util.Scanner;

import banking0417망함.MenuSelectException;

public class BankingSystemMain {
	
	static Scanner scan = new Scanner(System.in);
	static MenuSelectException menuexpt = 
			new MenuSelectException();

	public static void main(String[] args) {
		
		
		while(true) {//2.1번이 실행되는거 보고 while로 묶기
		//메뉴출력(1.틀짜기)
		AccountManager.showMenu();
		System.out.print("메뉴입력:");
		int key = 0;
		try {
			key = MenuSelectException.menuexception();
		} catch (MenuSelectException e) {
			System.out.println(e.getMessage());
		}
		switch(key) {
		//7.case1 > ICustomDefine.make로 바꾸기	
		case ICustomDefine.MAKE:
				//계좌개설
				System.out.println("***신규계좌개설***");
				System.out.println("---계좌선택---");
				AccountManager.accountChoice();//8
					int NorH = scan.nextInt();
						switch(NorH) {
							case 1:
								AccountManager.makeNAccount();
								break;
							case 2:
								AccountManager.makeHAccount();
						}
					break;
			case ICustomDefine.DEPOSIT:
				//입금
				System.out.println("***입금***");
				AccountManager.depositMoney();
				break;
			case ICustomDefine.WITHDRAW:
				//출금
				System.out.println("***출금***");
				AccountManager.withdrawMoney();
				break;
			case ICustomDefine.INQUIRE:
				//계좌정보출력
				System.out.println("----------");
				System.out.println("***계좌정보출력***");
				AccountManager.showAccInfo();
				System.out.println("----------");
				break;
			case ICustomDefine.EXIT:
				//프로그램종료
				System.exit(0);
				break;
			}//switch 끝
		}//while 끝
	}//main 끝

}//class 끝
