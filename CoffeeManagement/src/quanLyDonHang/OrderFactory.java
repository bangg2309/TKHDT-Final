package quanLyDonHang;

import java.util.List;

public class OrderFactory {
	public static Order createOrder(int orderId, String customerName, List<String> items) {
		return new Order(orderId, customerName, items);
	}
	
}
