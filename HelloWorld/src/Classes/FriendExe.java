package Classes;

import java.util.Scanner;

public class FriendExe {
	public static void main(String[] args) {
		Friend[] feArray = new Friend[10];
		Scanner scanner = new Scanner(System.in);

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

	static Scanner scanner;

	private static void unifrined() {
		FriendExe fe = new FriendExe();
		System.out.println("-----------------------");
		System.out.println("1.대학교 | 2.회사 | 3.그외 ");
		System.out.println("-----------------------");
		System.out.println("선택> ");
		String name = scanner.nextLine();
		fe.set

		scanner.nextLine();
		int sn;
		if (sn == 1) {
			System.out.println();

			for (int i = 0; i < feArray.length; i++) {
				if (feArray[i] == null) {
					feArray[i] = fe;
					break;
				}
			}
		}
	}

	private static void sch() {

	}

	private static void list() {

	}
}
