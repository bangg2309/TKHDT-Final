package quanLyBan;

public class TableFactory {
	public static Table createTable(String type, int tableNumber, int numberOfSeats) {
		if (type.equalsIgnoreCase("Small")) {
			return new SmallTable(tableNumber, numberOfSeats);
		} else if (type.equalsIgnoreCase("Medium")) {
			return new MediumTable(tableNumber, numberOfSeats);
		} else if (type.equalsIgnoreCase("Large")) {
			return new LargeTable(tableNumber, numberOfSeats);
		} else {
			return null;
		}
	}
}
