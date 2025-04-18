package banking0417_0418;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingSystemMain {
	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		while(true) {
		AccountManager.showMenu();
		System.out.print("메뉴입력:");
		int key;
		try{
			key = readmenu();
		}
		catch(MenuSelectException e) {
			System.out.println(e.getMessage());
			continue;
		}
		switch(key) {
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
	
	public static int readmenu() throws MenuSelectException{
		int key = 0;
		try {
			key = scan.nextInt();
			scan.nextLine();
		}
		catch(InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다");
			e.printStackTrace();
			System.exit(0);
		}
		if(key<=0 || key>5) {
			MenuSelectException menusel = 
					new MenuSelectException();
			throw menusel;
		}
		return key;
	}
	

}//class 끝
