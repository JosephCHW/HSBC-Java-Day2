
abstract public class Bank {
	// bank of england lets other banks decide their own way to open an account
	// hence methods have no code
	// abstract classes define the rules - you have to have method to open account, show balance etc
	// subclasses must implement all inherited methods of an abstract class
	abstract public void openAccount();
	abstract public void showBalance();
	// we cannot create the object of the abstract class
	final public void closeAccount() { // final means method can't be overwritten (opposite of abstract)
		System.out.println("Account closing");
	}
	public void welcome() {
		System.out.println("Welcome to the bank");
	}
}
