package quanLyBan;

public class RemoveTableCommand implements TableCommand {
    private Table table;


    public RemoveTableCommand(Table table) {
        this.table = table;
    }

	public void execute() {
        // remove table from database
        System.out.println("Table removed from database.");
    }
}
