package bank.schema;

import java.util.Scanner;

public class BankingSystemMain {
	
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
		System.out.print("계좌번호:");
		String a = scan.nextLine();
		System.out.print("입금액:");
		int depMoney = scan.nextInt();
		System.out.println("입금이 완료되었습니다.");
	}
	// 출    금
	public static void withdrawMoney() {
		
	}
	// 전체계좌정보출력
	public static void showAccInfo() {
		for(int i=0 ; i<accCnt ; i++) {
			//13.toString을 오버라이딩 했으므로 인스턴스를 그대로 출력
			System.out.println(accounts[i]);
		}
		System.out.println("**전체 계좌정보가 출력됨**");
		
	}


	public static void main(String[] args) {
		
		
		while(true) {//2.1번이 실행되는거 보고 while로 묶기
		//메뉴출력(1.틀짜기)
		showMenu();
		System.out.print("메뉴입력:");
		int key = scan.nextInt();
		scan.nextLine();//14.버퍼에 남은 엔터키 제거
		switch(key) {
		//7.case1 > ICustomDefine.make로 바꾸기	
		case ICustomDefine.MAKE:
				//계좌개설
				System.out.println("계좌개설");
				makeAccount();//8
				break;
			case ICustomDefine.DEPOSIT:
				//입금
				System.out.println("입금");
				depositMoney();
				break;
			case ICustomDefine.WITHDRAW:
				//출금
				System.out.println("출금");
				withdrawMoney();
				break;
			case ICustomDefine.INQUIRE:
				//계좌정보출력
				System.out.println("계좌정보출력");
				showAccInfo();
				break;
			case ICustomDefine.EXIT:
				//프로그램종료
				System.exit(0);
				break;
			}//switch 끝
		}//while 끝
	}//main 끝

}//class 끝
