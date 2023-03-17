package quanLyThongTinSanPham;

public class ProductFactoryImpl implements ProductFactory {
	 public Product createProduct(String name, double price) {
	       if (name.equals("Coffee")) {
			return new Coffee(name, price);
		} else if (name.equals("Tea")) {
			return new Tea(name, price);
		}
	       return null;
	}
}
