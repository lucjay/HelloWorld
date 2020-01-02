package test;

import java.util.Scanner;

public class MemberExe {
	static Scanner scn = new Scanner(System.in);
	static Member mm = null;
	static Member[] memAry = new Member[100];

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("-------------수영장 회원관리-------------");
			System.out.println("1.추가 | 2.수정 | 3.삭제 | 4.리스트 | 5.종료 ");
			System.out.println("------_------------------------------");
			System.out.println("메뉴를 선택 하세요. > ");

			int mNo = scn.nextInt();
			scn.nextLine();
			if (mNo == 1) {
				add();
			} else if (mNo == 2) {
				mod();
			} else if (mNo == 3) {
				del();
			} else if (mNo == 4) {
				list();
			} else if (mNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void add() {

		System.out.println("사용할 ID를 입력해 주세요.");
		String memberId = scn.nextLine();
		System.out.println("이름을 입력해주세요.");
		String name = scn.nextLine();
		System.out.println("연락처를 입력해주세요.");
		String phone = scn.nextLine();

		mm = new Member(memberId, name, phone);

		System.out.println("저장 되었습니다.");

		for (int i = 0; i < memAry.length; i++) {
			if (memAry[i] == null) {
				memAry[i] = mm;
				break;
			}
		}
	}

	private static void mod() {
		System.out.println("--------------------");
		System.out.println("1.이름 수정 | 2.번호 수정 ");
		System.out.println("--------------------");
		System.out.println("선택> ");
		int no = scn.nextInt();
		scn.nextLine();
		if (no == 1) {
			System.out.println("수정할 ID를 입력해 주세요.");
			String memberId = scn.nextLine();
			for (int i = 0; i < memAry.length; i++) {
				if (memberId.equals(memAry[i].getMemberId())) {
					mm.getMemberId();
					System.out.println("이름을 입력해주세요.");
					String name = scn.nextLine();
					String a = name;
					memAry[i].setName(name);
					System.out.println("수정 되었습니다.");
				}
			}

		} else if (no == 2) {
			System.out.println("수정할 ID를 입력해 주세요.");
			String memberId = scn.nextLine();
			mm.getMemberId();
			System.out.println("연락처를 입력해주세요.");
			String phone = scn.nextLine();
			mm.setPhone(phone);

			System.out.println("수정 되었습니다.");

		}
	}

	private static void del() {
		System.out.println("삭제할 ID를 입력해 주세요.");
		String memberId = scn.nextLine();
		memAry[0] = null;
		System.out.println("삭제 되었습니다.");

	}

	private static void list() {
		System.out.println("------");
		System.out.println("회원목록");
		System.out.println("------");
		for (Member a : memAry) {
			if (a != null) {
				System.out.println(a);
			}
		}
	}
}