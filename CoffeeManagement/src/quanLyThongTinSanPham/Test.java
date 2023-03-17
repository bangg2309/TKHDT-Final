package quanLyThongTinSanPham;

public class Test {
	public static void main(String[] args) {
		Product p1 = new Coffee("Cà phê", 20);
		Product p2 = new Coffee("Cà phê sữa", 20);
		Product p3 = new Coffee("Nước cam", 20);
		
		ProductManager productMng = new ProductManager();
		productMng.addProduct(p3);
		productMng.addProduct(p2);
		
		productMng.createProduct("Tea", 20);
	
//		
//		System.out.println();
//		
		productMng.removeProduct(p2);
//		
		System.out.println("Danh sách thức uống: ");
		productMng.displayManager();
		
		
		productMng.undoLastCommand();
		
		productMng.displayManager();
	}

}
