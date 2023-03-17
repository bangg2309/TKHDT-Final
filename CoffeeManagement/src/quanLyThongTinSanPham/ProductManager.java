package quanLyThongTinSanPham;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductManager {
	private List<Command> commandHistory = new ArrayList<>();
	private List<Product> productList;
	private ProductFactory productFactory;

	public ProductManager() {
		productList = new ArrayList<Product>();
		commandHistory = new ArrayList<Command>();
		productFactory = new ProductFactoryImpl();
	}
	
	public void createProduct(String name, double price) {
		Product p = productFactory.createProduct(name, price);
		addProduct(p);
	}

	public void addProduct(Product product) {
		Command command = new AddProductCommand(product, productList);
		command.execute();
		commandHistory.add(command);
	}

	public void removeProduct(Product product) {
		Command command = new RemoveProductCommand(product, productList);
		command.execute();
		commandHistory.add(command);
	}

	public void undoLastCommand() {
		if (commandHistory.size() > 0) {
			Command lastCommand = commandHistory.get(commandHistory.size() - 1);
			lastCommand.undo();
			commandHistory.remove(lastCommand);
		}
	}

	public void displayManager() {
		for (Product pro : productList) {
			System.out.println(pro);
		}
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	// other methods for managing products

}
