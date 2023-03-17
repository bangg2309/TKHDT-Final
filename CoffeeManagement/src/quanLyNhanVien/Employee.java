package quanLyNhanVien;

public abstract class Employee {
	protected String job;
	protected String name;
	protected double salary;

	public Employee(String job, String name, double salary) {
		super();
		this.job = job;
		this.name = name;
		this.salary = salary;
	}

	public abstract void display();
}
