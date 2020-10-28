
public class Maths2 {
	public void multiply(int a, int b) { // adding new function
		int result = a * b;
		System.out.println("The result is " + result);
	}
	public void subtraction(int a, int b) { // overriding parent function to make it better
		int result = a - b;
		System.out.println("The result is " + result);
	}
	
	// can do both of these to change functionality without changing source code
	
}

