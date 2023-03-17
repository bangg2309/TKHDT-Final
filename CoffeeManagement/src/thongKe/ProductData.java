package thongKe;

import java.util.ArrayList;
import java.util.List;

// Interface để khai báo các phương thức cập nhật khi có sự thay đổi trong dữ liệu

public class ProductData {
	private List<String> productList = new ArrayList<>();
	private List<Observer> observerList = new ArrayList<>();

	// Phương thức để thêm sản phẩm vào danh sách
	public void addProduct(String product) {
		productList.add(product);
		notifyObservers();
	}

	// Phương thức để xóa sản phẩm khỏi danh sách
	public void removeProduct(String product) {
		productList.remove(product);
		notifyObservers();
	}

	// Phương thức để đăng ký (subscribe) đối tượng thống kê
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	// Phương thức để hủy đăng ký (unsubscribe) đối tượng thống kê
	public void unregisterObserver(Observer observer) {
		observerList.remove(observer);
	}

	// Phương thức để thông báo cập nhật đến các đối tượng thống kê
	private void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}

	// Phương thức để lấy danh sách sản phẩm
	public List<String> getProductList() {
		return productList;
	}
}
