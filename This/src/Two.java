
public class Two extends One {
	int B;
	public Two() {
		super(2); // if this is here, 2nd constructor of One is called
		// if this is not here, 1st constructor of One is called
		// by default, super() would be written in
		System.out.println("Welcome to the 1st constructor of Two");
	}
	public Two(int a) {
		// super() automatically inserted here
		System.out.println("Welcome to the 2nd constructor of Two");
	}
}
