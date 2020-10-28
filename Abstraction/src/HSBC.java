
public class HSBC extends Bank {
	public void showBalance() {
		System.out.println("This is your balance");
	}
	public void openAccount() {
		System.out.println("Account opening");
	}
	public void welcome() { // overwrite public method from abstract
		System.out.println("Welcome to HSBC");
	}
}
