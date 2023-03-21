package quanLyBan;

public class AddTableCommand implements TableCommand {
	private Table table;
	
	
	public AddTableCommand(Table table) {
		this.table = table;
	}

	public void execute() {
		// add table to database
		System.out.println("Table added to database.");
	}
}
