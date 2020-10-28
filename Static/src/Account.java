
public class Account {
	static int dollar;
	public void amount (int amo) {
		int T = amo * dollar;
		System.out.println("Amount: " + T);
	} // this could be static too
	public void setDollar (int D) {
		dollar = D;
	}
}

