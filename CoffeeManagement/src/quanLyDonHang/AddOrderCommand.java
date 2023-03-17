package quanLyDonHang;

import java.util.List;

public class AddOrderCommand implements Command {
	private Order order;
	private List<Order> orderList;

	public AddOrderCommand(Order order, List<Order> orderList) {
		this.order = order;
		this.orderList = orderList;
	}

	@Override
	public void execute() {
		orderList.add(order);
		System.out.println("Thêm mới đơn hàng thành công!");
	}
}
