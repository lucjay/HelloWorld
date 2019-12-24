package Classes;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.personBirth = "990222-3";
		p1.personName = "KGS";
		p1.personTall = "155cm";
		p1.personBorn = "Daegu";
		p1.introduce();
		Scanner scanner = new Scanner(System.in);

		Person p2 = new Person("Newyork", "Amy");
		p2.introduce();

		Person p3 = new Person("Seoul", "Nana");

		Person[] pAry = new Person[3];
		pAry[0] = p1;
		pAry[1] = p2;
		pAry[2] = p3;

		System.out.println("*******************");

		for (int i = 0; i < 3; i++) {
			pAry[i].introduce();
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			pAry[i].work();
			System.out.println();
		}
		pAry[2].work();
		System.out.println("*********");

		// 확장 for
		for (Person P : pAry) {
			P.introduce();
		}

		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		String se;
		boolean run = true;
		while (run) {
			System.out.println("*이름을 입력하세요.*");
			se = scanner.nextLine();
			for (Person P : pAry) {
				System.out.println();
				if (se.equals(P.personName))
					P.introduce();
			}
		}
	}

}
