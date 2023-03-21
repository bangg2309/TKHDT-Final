package quanLyDonHang;

import java.util.List;

import quanLyBan.Table;
import quanLyBan.TableFactory;
import quanLyThongTinSanPham.Product;

public class OrderFactory {
	public Order createOrder(int orderId, String customerName, TableFactory tableFactory, List<Product> items) {
		return new Order(orderId, customerName, tableFactory, items);
	}

}
