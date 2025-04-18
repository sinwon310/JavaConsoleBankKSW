package gpt;

public class HighCreditAccount extends Account{
	

	public HighCreditAccount(String accNum, String name,
			int balance, double interest, String credit) {
		super(accNum, name, balance, interest, credit);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
	           "기본이자: " + interest + "%\n" +
	           "신용등급: " + credit;
	}
	
}
