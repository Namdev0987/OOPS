package in.com.exception;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.deposite(5000);
		try {
			a.withdrawl(2900);
		} catch (InsufficientBalance e) {
		
			System.out.println(e);
		
		a.deposite(5000);
	}
}
}