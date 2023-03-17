package quanLyNhanVien;

public class Test {
	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
		manager.addEmployee("Manager", "Cong Thinh", 50);
		manager.addEmployee("Manager", "Qui Bang", 60);
		manager.addEmployee("Waiter", "Huu Tinh", 30);
		
		manager.manager();
		
		Employee e = new Manager("Manager", "Qui Bang", 60);
		manager.removeEmployee(e);
	}
	

}
