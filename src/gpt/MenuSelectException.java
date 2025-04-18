package gpt;

import java.util.Scanner;

public class MenuSelectException extends Exception{
	
	public MenuSelectException() {
        super("메뉴 선택 예외 발생: 1~5 사이의 정수를 입력하세요.");
    }

    public MenuSelectException(String message) {
        super(message);
    }

    // 메뉴 선택 유효성 검사 메서드
    public int menuexc(Scanner scan) {
        int menu = 0;
        while (true) {
            try {
                String input = scan.nextLine();
                menu = Integer.parseInt(input); // 숫자 아닌 입력 시 NumberFormatException 발생
                if (menu < 1 || menu > 5) {
                    throw new MenuSelectException();
                }
                break; // 올바른 입력이므로 반복 종료
            } catch (NumberFormatException e) {
                System.out.print("숫자를 입력해주세요: ");
            } catch (MenuSelectException e) {
                System.out.print("1~5 사이의 메뉴 번호를 입력하세요: ");
            }
        }
        return menu;
    }

}
