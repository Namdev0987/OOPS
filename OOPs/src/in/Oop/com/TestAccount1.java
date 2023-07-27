package in.Oop.com;

public class TestAccount1 {
	public static void main(String[] args) {
		Account1 a = new Account1();
		
		a.deposite(5000);
		
		try {
			a.withdrawl(3500);
			
		} catch (InsufficientBalance e) {
			System.out.println(e);
			// TODO: handle exception
		}
		a.deposite(5000);
		
	}
}
