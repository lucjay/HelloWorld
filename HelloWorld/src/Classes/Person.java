package Classes;

public class Person {
	String personName;
	String personBirth;
	String personTall;
	String personBorn;

	Person() {

	}

	Person(String personBorn, String personName) {
		this.personBorn = personBorn;
		this.personName = personName;
	}

	void introduce() {
		System.out.println("I was Born in " + personBorn + " and My name is " + personName);
	}

	void eat() {
		System.out.println("먹는다.");
	}

	void sleep() {
		System.out.println("잔다.");
	}

	void run() {
		System.out.println("달린다.");
	}

	void work() {
		System.out.println("저는 " + personBorn + " 에서 일합니다.");
	}

}
