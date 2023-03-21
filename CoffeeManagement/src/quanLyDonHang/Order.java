package quanLyDonHang;

import java.util.List;

import quanLyBan.Table;
import quanLyBan.TableFactory;
import quanLyThongTinSanPham.Product;

public class Order {
	private int orderId;
	private String customerName;
	private TableFactory table;
	private List<Product> items;

	public Order(int orderId, String customerName,TableFactory table, List<Product> items) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.setTable(table);
		this.items = items;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Product> getItems() {
		return items;
	}

	public void setItems(List<Product> items) {
		this.items = items;
	}
	
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", table=" + table + ", items=" + items
				+ "]";
	}

	public TableFactory getTable() {
		return table;
	}

	public void setTable(TableFactory table) {
		this.table = table;
	}
	

}
