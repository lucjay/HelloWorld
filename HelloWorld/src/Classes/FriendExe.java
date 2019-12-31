package Classes;

import java.util.Scanner;

public class FriendExe {
	static Friend[] feArray = new Friend[100];
	static Friend ff = null;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.입력 | 2.조회 | 3.리스트 | 4.종료 ");
			System.out.println("-------------------------------");
			System.out.println("선택> ");

			int sNo = scanner.nextInt();
			scanner.nextLine();
			if (sNo == 1) {
				unifrined();
			} else if (sNo == 2) {
				sch();
			} else if (sNo == 3) {
				list();
			} else if (sNo == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

	private static void unifrined() {

		System.out.println("-----------------------");
		System.out.println("1.대학교 | 2.회사 | 3.그외 ");
		System.out.println("-----------------------");
		System.out.println("선택> ");
		int sn = scanner.nextInt();
		scanner.nextLine();
		if (sn == 1) {
			System.out.println("이름을 입력해주세요.");
			String name = scanner.nextLine();
			System.out.println("연락처를 입력해주세요.");
			String phone = scanner.nextLine();
			System.out.println("학교를 입력해주세요.");
			String univ = scanner.nextLine();
			System.out.println("전공을 입력해주세요.");
			String major = scanner.nextLine();

			ff = new UnivFriend(name, phone, univ, major);

			System.out.println("저장 되었습니다.");

		} else if (sn == 2) {
			System.out.println("이름을 입력해주세요.");
			String name = scanner.nextLine();
			System.out.println("연락처를 입력해주세요.");
			String phone = scanner.nextLine();
			System.out.println("회사를 입력해주세요.");
			String company = scanner.nextLine();
			System.out.println("부서를 입력해주세요.");
			String dept = scanner.nextLine();

			ff = new ComFriend(name, phone, dept, company);

			System.out.println("저장 되었습니다.");
		} else if (sn == 3) {
			System.out.println("이름을 입력해주세요.");
			String name = scanner.nextLine();
			scanner.nextLine();
			System.out.println("연락처를 입력해주세요.");
			String phone = scanner.nextLine();

			ff = new Friend(name, phone);
			System.out.println("저장 되었습니다.");

		}

		for (int i = 0; i < feArray.length; i++) {
			if (feArray[i] == null) {
				feArray[i] = ff;
				break;

			}
		}
	}

	private static void sch() {
		System.out.println("이름을 입력해");
		String input = scanner.nextLine();
		for (Friend a : feArray) {
			if (a != null) {
				if (input.equals(a.getName())) {
					System.out.println("친구나왔어");
					a.introduce();
				}
			}
		}
	}

	private static void list() {
		for (Friend aa : feArray) {
			if (aa != null) {
				aa.introduce();
			}
		}
	}
}
