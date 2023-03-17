package tinhTien;

import quanLyThongTinSanPham.Product;
import quanLyThongTinSanPham.ProductManager;

public class CalculateByProduct implements PaymentStrategy {
	
	public double calculate(double amount) {
		// tính tiền bằng cách chọn sản phẩm
		// ...
		return amount;
	}

	public double sum(ProductManager pro) {
		double result = 0;
		for (Product product : pro.getProductList()) {
			result += product.getPrice();
		}
		return result;

	}

}
