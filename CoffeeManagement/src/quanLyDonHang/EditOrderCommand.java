package quanLyDonHang;

import java.util.List;

public class EditOrderCommand implements Command {
	private Order order;
	private List<Order> orderList;

	public EditOrderCommand(Order order, List<Order> orderList) {
		this.order = order;
		this.orderList = orderList;
	}

	@Override
	public void execute() {
		for (Order o : orderList) {
			if (o.getOrderId() == order.getOrderId()) {
				o.setCustomerName(order.getCustomerName());
				o.setItems(order.getItems());
				System.out.println("Sửa thông tin đơn hàng thành công!");
				return;
			}
		}
		System.out.println("Không tìm thấy đơn hàng có mã " + order.getOrderId());
	}
}
