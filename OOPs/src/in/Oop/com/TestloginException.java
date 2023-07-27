package in.Oop.com;

public class TestloginException {
	public static void main(String[] args) {
		String name = "deepak";
		if (name.equals("deepa")){
			System.out.println("valid User ....!");
		}else {
			try { 
				throw  new LoginException();
			}
			catch(Exception e){
				System.out.println(e);
				
			}
		}
	}
}
