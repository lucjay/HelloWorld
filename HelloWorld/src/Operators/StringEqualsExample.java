package Operators;

class Student {
	int age;
	String name;
}

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "이빈우";
		String str2 = "이빈우";
		String str3 = new String("이빈우");

		Student stu1 = new Student();

		System.out.println(stu1);
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str3);
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));

		if (str1.equals(str3)) {
			System.out.println("같은 내용입니다.");
		} else {
			System.out.println("다른 내용입니다.");
		}

	}

}
