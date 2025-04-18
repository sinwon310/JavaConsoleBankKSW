package gpt;

import java.util.Scanner;

public class BankingSystemMain {
	
	static Scanner scan = new Scanner(System.in);
	static MenuSelectException menusel = 
			new MenuSelectException();
	public static void main(String[] args) {
		
		
		while (true) {
	        AccountManager.showMenu();
	        System.out.print("메뉴입력: ");
	        
	        int key = menusel.menuexc(scan); // 메뉴 번호를 예외처리 포함하여 입력받음
	        
	        switch (key) {
	            case ICustomDefine.MAKE:
	                System.out.println("***신규계좌개설***");
	                System.out.println("---계좌선택---");
	                AccountManager.accountChoice();
	                int NorH = scan.nextInt();
	                scan.nextLine();
	                switch (NorH) {
	                    case 1:
	                        AccountManager.makeNAccount();
	                        break;
	                    case 2:
	                        AccountManager.makeHAccount();
	                        break;
	                }
	                break;
	            case ICustomDefine.DEPOSIT:
	                System.out.println("***입금***");
	                AccountManager.depositMoney();
	                break;
	            case ICustomDefine.WITHDRAW:
	                System.out.println("***출금***");
	                AccountManager.withdrawMoney();
	                break;
	            case ICustomDefine.INQUIRE:
	                System.out.println("----------");
	                System.out.println("***계좌정보출력***");
	                AccountManager.showAccInfo();
	                System.out.println("----------");
	                break;
	            case ICustomDefine.EXIT:
	                System.exit(0);
	                break;
	        }
		}
	}//main 끝

}//class 끝
