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
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		User u1 = new User();
		u1.setUsername("thinh");
		u1.setPassword("123");
		System.out.println(u1.login("thinh", "1234"));
		System.out.println(u1.login("thinh", "123"));
	}
}
