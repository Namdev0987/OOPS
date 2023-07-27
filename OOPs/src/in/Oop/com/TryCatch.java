package in.Oop.com;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 2;
			int c = a / b;
			System.out.println("Division = "+ c);
			String name = null;
			System.out.println(name.length());
			System.out.println(name.charAt(4));
		} catch (Exception e){
			System.out.println(e);
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("after catch block ");
		
	}
}
