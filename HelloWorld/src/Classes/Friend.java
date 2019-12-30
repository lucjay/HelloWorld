package Classes;

public class Friend {
	private String name;
	private String phone;

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}

	public void introduce() {
		System.out.println("이름은:" + name + "연락처는:" + phone);
	}

}
