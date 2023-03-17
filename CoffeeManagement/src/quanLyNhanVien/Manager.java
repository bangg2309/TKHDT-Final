package quanLyNhanVien;

public class Manager extends Employee{

	

	public Manager(String job, String name, double salary) {
		super(job, name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("Job: Manager -- " + name + " -- " + salary);
		}

	

}
