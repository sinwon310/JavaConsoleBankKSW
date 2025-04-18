package banking0417망함;


public class NormalAccount extends Account{
	
	
	public NormalAccount(String accNum, String name, 
			int balance, double interest) {
		super(accNum, name, balance, interest);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"+
				"기본이자:" + interest + "%";
	}

}
