package quanLyBan;

public class TableFactory {
	public Table createTable(String type, int tableNumber, int numberOfSeats) {
		Table table = null;
		if (type.equalsIgnoreCase("Small")) {
			table = new SmallTable(tableNumber, numberOfSeats);
		} else if (type.equalsIgnoreCase("Medium")) {
			table = new MediumTable(tableNumber, numberOfSeats);
		} else if (type.equalsIgnoreCase("Large")) {
			table = new LargeTable(tableNumber, numberOfSeats);
		}
		return table;
		
	}
	
}
