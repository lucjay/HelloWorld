package Classes;

import java.util.Scanner;

public class FriendExe {
	public static void main(String[] args) {
		Friend [] feArray = new Friend[10];
		Scanner sc = new Scanner(System.in);

		
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.입력 | 2.조회 | 3.리스트 | 4.종료 ");
			System.out.println("-------------------------------");
			System.out.println("선택> ");
			
			int sNo = sc.nextInt();
			sc.nextLine();
			if (sNo == 1) {
				(unifrined);
			} else if (sNo == 2) {
				(sch);
			} else if (sNo == 3) {
				(list);
			} else if (sNo == 4) {
				run = false;			
	}
		}
		System.out.println("프로그램 종료");
		
	}

	private static void unifrined() {
		Friend fe = new Friend("name", "phone");
		System.out.println("------선택");
		System.out.println("대학교");
		System.out.println("회사");
		System.out.println("그외");
		sNo = sc.nextInt();
		sc.nextLine();
		if (sNo == 1) {
			System.out.println();
		}

		for (int i = 0; i < feAray.length; i++) {
			if (feAray[i] == null) {
				feAray[i] = fe;
				break;
			}
		}
	}

	private static void sch() {

	}

	private static void list() {

	}
}
