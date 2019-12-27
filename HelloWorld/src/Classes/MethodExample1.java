package Classes;

public class MethodExample1 {
	public static void main(String[] args) {
		showName();
		showName("BINWOO");
		showAge(32);
	}

	public static void showName() {
		System.out.println("Hello, I am Charlie");
	}

	public static void showName(String name) { // 생성자 오버로딩 (메소드오버로딩)
		System.out.println("Hello, I am " + name);

	}

	public static void showAge(int age) {
		System.out.println("Hello, I am " + age + "years old.");
	}
	
	
}