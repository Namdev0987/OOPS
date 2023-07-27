package in.Oop.com;

public class Shape {
	private String color = null;
	private int borderWidth = 0;
	
	public Shape() {
		System.out.println("shape default const");
	}
	public Shape(String color, int borderWidth) {
		this();
		this.color = color;
		this.borderWidth = borderWidth;
	}
	public String getColor() {
		return color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
}
