package banking0417망함;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MenuSelectException extends Exception{
		
	public MenuSelectException() {
		super("1이상 5이하의 숫자를 입력하세요");
	}
	
public static int menuexception() throws MenuSelectException {
		
		Scanner scan = new Scanner(System.in);
		int key = 0;
		try {
			key = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("숫자를 입력하세요");
			e.printStackTrace();
			System.exit(0);
		}
		if(key<=0 || key>=6) {
			MenuSelectException ex = new MenuSelectException();
			throw ex;
		}
		return key;
	}
}


class MenuException {

	

}
