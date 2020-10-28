
public class Main {

	public static void main(String[] args) {
		Account HSBC, Natwest;
		HSBC = new Account();
		Natwest = new Account();
		
		HSBC.setDollar(100);
		Natwest.setDollar(100);
		HSBC.amount(10);
		Natwest.amount(10);
		
		HSBC.setDollar(102);
		HSBC.amount(10);
		Natwest.amount(10); // amount changes for both objects as dollar is static
		// if dollar not static, the amount of Natwest would not be changed by HSBC.setDollar()
		
		London.static_message(); // don't need to create object from class, because method is static
		// so the method is stored outside the class.
		// London.non_static_message() would generate an error
		London l = new London();
		l.non_static_message();
		// l.static_message() would generate an error as static_message() is not in the object
	}

}
