package quanLyThongTinSanPham;

import java.util.List;

public class RemoveProductCommand implements Command{
	private Product product;
	  private List<Product> productList;



	public RemoveProductCommand(Product product, List<Product> productList) {
		super();
		this.product = product;
		this.productList = productList;
	}



	@Override
	public void execute() {
		productList.remove(product);
        System.out.print("Removed product:");
        product.display();
	}



	@Override
	 public void undo() {
        productList.add(product);
        System.out.println("Undone remove product:");
    }
}
