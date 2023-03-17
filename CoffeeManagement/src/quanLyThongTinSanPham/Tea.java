package quanLyThongTinSanPham;

public class Tea implements Product {
	private String name;
	private double price;

	public Tea(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void display() {
		System.out.println("Product: Tea");
		System.out.println("Name: " + this.name + " -- Price: " + this.price);

	}

	@Override
	public String toString() {
		return "Name: " + this.name + " -- Price: " + this.price;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
}
