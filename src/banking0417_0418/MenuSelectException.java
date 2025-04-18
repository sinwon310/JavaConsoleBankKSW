package banking0417_0418;

public class MenuSelectException extends Exception{
	public MenuSelectException() {
		super("1~5 사이의 정수를 입력하세요");
	}
}
