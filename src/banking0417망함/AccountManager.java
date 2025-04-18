package banking0417망함;

import java.util.Scanner;

public class AccountManager {

    // 9. 키보드 입력을 위한 인스턴스
    static Scanner scan = new Scanner(System.in);
    // 9. 계좌정보 저장을 위한 인스턴스배열 생성
    static Account[] accounts = new Account[50];
    // 9. 개설된 계좌정보 카운트용 변수
    static int accCnt = 0;

    // 메뉴 출력
    public static void showMenu() {
        System.out.println("-----Menu------");
        System.out.println("1.계좌개설");
        System.out.println("2.입금");
        System.out.println("3.출금");
        System.out.println("4.전체계좌정보출력");
        System.out.println("5.프로그램종료");
    }

    public static void accountChoice() {
        System.out.println("1.보통계좌");
        System.out.println("2.신용신뢰계좌");
    }

    // 계좌개설을 위한 함수 - 보통 계좌
    public static void makeNAccount() {
        //10
        System.out.print("계좌번호:");
        String a = scan.nextLine();
        System.out.print("고객이름:");
        String n = scan.nextLine();
        System.out.print("잔고:");
        int b = scan.nextInt();
        System.out.print("기본이자%(정수형태로입력):");
        int i = scan.nextInt();
        scan.nextLine();

        // 11. 보통 계좌 생성 및 추가
        NormalAccount ac = new NormalAccount(a, n, b, i);
        accounts[accCnt++] = ac;
        System.out.println("계좌개설이 완료되었습니다");
    }

    // 계좌개설을 위한 함수 - 신용신뢰 계좌
    public static void makeHAccount() {
        System.out.print("계좌번호:");
        String a = scan.nextLine();
        System.out.print("고객이름:");
        String n = scan.nextLine();
        System.out.print("잔고:");
        int b = scan.nextInt();
        System.out.print("기본이자%(정수형태로입력):");
        int i = scan.nextInt();
        scan.nextLine();
        System.out.print("신용등급(A,B,C등급):");
        String c = scan.nextLine();

        // 11. 신용신뢰 계좌 생성 및 추가
        HighCreditAccount ac = new HighCreditAccount(a, n, b, i, c);
        accounts[accCnt++] = ac;
        System.out.println("계좌개설이 완료되었습니다");
    }

    // 입금
    public static void depositMoney() {
        System.out.print("계좌번호:");
        String accNum1 = scan.nextLine();

        boolean isFind = false;
        for (int i = 0; i < accCnt; i++) {
            if (accounts[i].getAccNum().equals(accNum1)) {
                System.out.print("입금액:");
                int money = scan.nextInt();
                scan.nextLine();
                

                if (accounts[i] instanceof HighCreditAccount) {
                    ((HighCreditAccount) accounts[i]).calHInterest(money);
                } else if (accounts[i] instanceof NormalAccount) {
                    ((NormalAccount) accounts[i]).calNInterest(money);
                }

                isFind = true;
                break;
            }
        }
        if (!isFind) {
            System.out.println("계좌가 존재하지 않습니다.");
        } else {
            System.out.println("입금이 완료되었습니다.");
        }
    }

    // 출금
    public static void withdrawMoney() {
        System.out.print("계좌번호:");
        String accNum1 = scan.nextLine();

        boolean isFind = false;
        for (int i = 0; i < accCnt; i++) {
            if (accounts[i].getAccNum().equals(accNum1)) {
                System.out.print("출금액:");
                int money = scan.nextInt();
                scan.nextLine();

                accounts[i].withdraw(money);
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            System.out.println("계좌가 존재하지 않습니다.");
        } else {
            System.out.println("출금이 완료되었습니다");
        }
    }

    // 전체계좌정보출력
    public static void showAccInfo() {
        for (int i = 0; i < accCnt; i++) {
            System.out.println(accounts[i]);
            System.out.println("-----------");
        }
        System.out.println("전체계좌정보 출력이 완료되었습니다");
    }

}