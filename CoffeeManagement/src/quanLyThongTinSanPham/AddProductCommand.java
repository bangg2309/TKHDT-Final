package quanLyThongTinSanPham;

import java.util.List;

public class AddProductCommand implements Command {
	private Product product;
	private List<Product> productList;

	public AddProductCommand(Product product, List<Product> productList) {
		super();
		this.product = product;
		this.productList = productList;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		productList.add(product);
		System.out.println("Added product:");
		product.display();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

		productList.remove(product);
		System.out.println("Undone add product:");

	}

}
