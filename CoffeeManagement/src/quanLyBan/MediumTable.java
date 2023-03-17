package quanLyBan;

public class MediumTable implements Table {
    private int tableNumber;
    private int numberOfSeats;


    public MediumTable(int tableNumber, int numberOfSeats) {
        this.tableNumber = tableNumber;
        this.numberOfSeats = numberOfSeats;
        displayInfo();
    }


    public void displayInfo() {
        System.out.println( "Medium --> " + "Table Number: " + tableNumber + ", Number of Seats: " + numberOfSeats);
    }
}

