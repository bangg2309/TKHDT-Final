package quanLyBan;

public class SmallTable implements Table {
    private int tableNumber;
    private int numberOfSeats;


    public SmallTable(int tableNumber, int numberOfSeats) {
        this.tableNumber = tableNumber;
        this.numberOfSeats = numberOfSeats;
        displayInfo();
    }


    public void displayInfo() {
        System.out.println( "Small --> " + "Table Number: " + tableNumber + ", Number of Seats: " + numberOfSeats);
    }


}
