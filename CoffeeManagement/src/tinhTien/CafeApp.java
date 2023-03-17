package tinhTien;

import quanLyThongTinSanPham.Coffee;
import quanLyThongTinSanPham.Product;
import quanLyThongTinSanPham.ProductManager;

public class CafeApp {
	public static void main(String[] args) {
		PaymentContext context;

		// tính tiền bằng cách chọn sản phẩm
		context = new PaymentContext(new CalculateByProduct());
		double result = context.executeStrategy(100);
		System.out.println("Tính tiền bằng cách chọn sản phẩm: " + result);

		// tính tiền theo số lượng sản phẩm
		context = new PaymentContext(new CalculateByQuantity());
		result = context.executeStrategy(100);
		System.out.println("Tính tiền theo số lượng sản phẩm: " + result);

		// tính tiền theo giá trị đơn hàng
		context = new PaymentContext(new CalculateByValue());
		result = context.executeStrategy(100);
		System.out.println("Tính tiền theo giá trị đơn hàng: " + result);
		
		Product p1 = new Coffee("Cà phê", 20);
		Product p2 = new Coffee("Cà phê sữa", 20);
		Product p3 = new Coffee("Nước cam", 20);
		
		ProductManager productMng = new ProductManager();
		productMng.addProduct(p3);
		productMng.addProduct(p2);
//		
//		System.out.println();
//		
		productMng.removeProduct(p2);
//		
		System.out.println("Danh sách thức uống: ");
//		productMng.displayManager();
		
		
		productMng.undoLastCommand();
		
		productMng.displayManager();
		
		CalculateByProduct c = new CalculateByProduct();
		System.out.println(c.sum(productMng));
	}
}
