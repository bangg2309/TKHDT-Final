package view;
import java.util.ArrayList;
import java.util.List;

import dangNhap.*;
import quanLyBan.AddTableCommand;
import quanLyBan.SmallTable;
import quanLyBan.Table;
import quanLyBan.TableFactory;
import quanLyDonHang.AddOrderCommand;
import quanLyDonHang.Order;
import quanLyDonHang.OrderFactory;
import quanLyThongTinSanPham.Coffee;
import quanLyThongTinSanPham.Product;
import quanLyThongTinSanPham.ProductManager;
import quanLyThongTinSanPham.Tea;

public class Testing {
	public static void main(String[] args) {					
		ProductManager productMng = new ProductManager();
		
		productMng.createProduct("Coffee", 10);
		productMng.createProduct("Tea", 15);	
		System.out.println("Danh sách thức uống: ");
		productMng.displayManager();
		
		
		TableFactory tableFactory = new TableFactory();
		tableFactory.createTable("Small", 2, 10);
		productMng.undoLastCommand();
		
		productMng.displayManager();
		/*
		 * Quan ly don hang
		 */
		List<Order> orders = new ArrayList<>();
		OrderFactory orderFactory = new OrderFactory();
		Order o1 = orderFactory.createOrder(1, "Bang",tableFactory, productMng.getProductList());
		AddOrderCommand addOrderCommand = new AddOrderCommand(o1, orders);
		addOrderCommand.execute();
		}
	}
	
	

