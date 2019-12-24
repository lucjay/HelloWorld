package Classes;

public class StudentExample {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("Hello");

		Student student = new Student();
		student.studentNo = "191234-1234";
		student.studentName = "가나다";
		student.age = 20;
		student.major = "English";
		student.university = " 유치원이고 ";
		student.introduce();
		System.out.println(student.major);
		student.doHomework();

		Student student1 = new Student("Yedam", "991111-1111", "라마바");
		student1.introduce();

//		System.out.println(student);

	}

}
