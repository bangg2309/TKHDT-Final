package thongKe;

import java.util.List;

import quanLyThongTinSanPham.Product;

public class StatisticsDisplay implements Observer {
	private ProductData productData;

	public StatisticsDisplay(ProductData productData) {
		this.productData = productData;
		productData.registerObserver(this);
	}

	@Override
	public void update() {
		List<Product> productList = productData.getProductList();
		int totalProducts = productList.size();
		System.out.println("Total number of products: " + totalProducts);
	}
}
