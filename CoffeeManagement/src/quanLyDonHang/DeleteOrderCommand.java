package quanLyDonHang;

import java.util.List;

public class DeleteOrderCommand implements Command {
	private int orderId;
	private List<Order> orderList;

	public DeleteOrderCommand(int orderId, List<Order> orderList) {
		this.orderId = orderId;
		this.orderList = orderList;
	}

	@Override
	public void execute() {
		for (Order order : orderList) {
			if (order.getOrderId() == orderId) {
				orderList.remove(order);
				System.out.println("Xóa đơn hàng thành công!");
				return;
			}
		}
		System.out.println("Không tìm thấy đơn hàng có mã " + orderId);
	}
}
