package entity;

public class Employees {
	
	private int age;
	private double salary;
	private String name;
	
	
	public Employees(int age, double salary, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employees [age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	
	

}
