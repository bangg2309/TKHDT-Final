package quanLyNhanVien;

import java.util.ArrayList;

public class EmployeeManager {
	private ArrayList<Employee> employees = new ArrayList<>();
	private EmployeeFactory factory;

	public EmployeeManager() {
		// TODO Auto-generated constructor stub
		factory = new FactoryExt();
	}

	public void addEmployee(String job, String name, double salary) {
		Employee employee = factory.createEmployee(job, name, salary);
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void manager() {
		for (Employee employee : employees) {
			employee.display();
		}
	}
}
