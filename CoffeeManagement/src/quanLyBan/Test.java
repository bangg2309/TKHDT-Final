package quanLyBan;

public class Test {
	public static void main(String[] args) {
		TableFactory tableFactory = new TableFactory();
		tableFactory.createTable("Small", 2, 10);
		tableFactory.createTable("Medium", 5, 50);
		tableFactory.createTable("Large", 10, 8);
		
	}
}
