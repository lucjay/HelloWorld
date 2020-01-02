package test;

public class Member {
	private String memberId;
	private String name;
	private String phone;

	public Member(String memberId, String name) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.phone = phone;

	}

	public Member() {

	}

	public Member(String memberId, String name, String phone) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.phone = phone;

	}

	public String getMemberId() {
		return memberId;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "회원 [ ID=" + memberId + ", 이름=" + name + ", 전화번호=" + phone + " ]";

	}
}
