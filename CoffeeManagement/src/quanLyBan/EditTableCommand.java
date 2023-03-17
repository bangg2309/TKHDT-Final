package quanLyBan;

public class EditTableCommand implements TableCommand {
	private Table table;

	public EditTableCommand(Table table) {
		this.table = table;
	}

	public void execute() {
		// edit table in database
		System.out.println("Table edited in database.");
	}
}
