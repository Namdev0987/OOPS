package in.com.collection;

public class Employe {
	private int id = 0;
	private String  name = null;
	private int salary = 0;
	
	public Employe(int id, String name, int salary ) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return id + " "+ name +" "+ " "+ salary;
	}
	@Override
	public boolean equals(Object obj) {
		return false;
		
	}
	
	
	
}
