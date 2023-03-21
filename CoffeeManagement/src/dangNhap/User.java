package dangNhap;

public class User {
	private static User instance;
	private String username;
	private String password;

	private User() {
		// Khởi tạo đối tượng User
	}
	

	public static synchronized User getInstance() {
		if (instance == null) {
			instance = new User();
		}
		return instance;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public boolean login(String username, String password) {
		// Kiểm tra thông tin đăng nhập của người dùng
		if (this.username.equals(username) && this.password.equals(password)) {
			System.out.println("Đăng nhập thành công");
			return true;
		} else {
			System.out.println("Sai thông tin tài khoản hoặc mật khẩu, vui lòng thử lại");
			return false;
		}
	}
	public boolean create(String username, String password) {
		if (getInstance().getUsername() != null) {
			System.out.println("Tên người dùng đã tồn tại");
			return false;
		}
		else {
			this.username = username;
			this.password = password;
			System.out.println("Tạo tài khoản thành công");
			return true;
		}
	}
	public static void main(String[] args) {
		getInstance().create("bang", "123");
		getInstance().create("bang", "123");
		getInstance().create("abc", "123");
		
		getInstance().login("bang", "123");
		getInstance().login("abc", "123");
		
	}
}
