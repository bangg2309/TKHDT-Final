package thongKe;

public class CafeManagementApp {
	public static void main(String[] args) {
		// Khởi tạo đối tượng lưu trữ dữ liệu sản phẩm
		ProductData productData = new ProductData();

		// Khởi tạo đối tượng thống kê
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(productData);

		// Thêm sản phẩm vào danh sách
		productData.addProduct("Cà phê đen");
		productData.addProduct("Cà phê sữa");
		productData.addProduct("Trà đào cam sả");
		productData.addProduct("Trà sen vắt");
		
		// Xóa sản phẩm khỏi
		productData.removeProduct("Cà phê đen");
		productData.removeProduct("Cà phê đen");
		
		
	}
}