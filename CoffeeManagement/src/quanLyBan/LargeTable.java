package quanLyBan;

public class LargeTable implements Table {
	private int tableNumber;
	private int numberOfSeats;

	public LargeTable(int tableNumber, int numberOfSeats) {
		this.tableNumber = tableNumber;
		this.numberOfSeats = numberOfSeats;
		displayInfo();
	}

	public void displayInfo() {
		System.out.println( "Large --> " + "Table Number: " + tableNumber + ", Number of Seats: " + numberOfSeats);
	}
	
}
