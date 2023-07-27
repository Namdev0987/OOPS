package in.Oop.com;

public class Rectangle extends Shape{
	private int length = 0;
	private int width = 0;
	
	public Rectangle() {
		
	}
	public Rectangle(int length,int width, String color,int borderwidth) {
		super(color, borderwidth);
		this.length = length;
		this.width = width;
		System.out.println("Rectangle 4 parms const");
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
}
