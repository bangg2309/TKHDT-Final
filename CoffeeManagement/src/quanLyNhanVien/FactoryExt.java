package quanLyNhanVien;

public class FactoryExt extends EmployeeFactory {

	@Override
	public Employee createEmployee(String job, String name, double salary) {
		if (job.equals("Manager")) {
			return new Manager(job, name, salary);
		} else if (job.equals("Waiter")) {
			return new Waiter(job, name, salary);
		}
		return null;
	}

}
