package method.override;

public class AxisBank extends BankInfo {

	public void deposit() {

          System.out.println("i also have account in Axis Bank");

	}
	
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
	}
}
