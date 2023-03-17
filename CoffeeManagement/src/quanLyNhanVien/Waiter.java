package quanLyNhanVien;

public class Waiter extends Employee{

	
	public Waiter(String job, String name, double salary) {
		super(job, name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Job: Waiter -- " + name + " -- " + salary);
	}
	
}
