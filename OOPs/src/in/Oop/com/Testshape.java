package in.Oop.com;

public class Testshape {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,10,"red",100);
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getColor());
		System.out.println(r.getBorderWidth());
		
	}

}
