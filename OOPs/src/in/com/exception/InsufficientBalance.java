package in.com.exception;

public class InsufficientBalance extends Exception {

	public InsufficientBalance() {

		super("bank account balance are insufficient");
	}

}
