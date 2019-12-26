package Classes;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountAry = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		Account acc = new Account();
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.println("계좌번호:");
		String ano = scanner.nextLine();
		acc.setAno(ano);
		System.out.println("계좌주:");
		String owner = scanner.nextLine();
		acc.setOwner(owner);
		System.out.println("초기입금액:");
		int balance = scanner.nextInt();
		acc.setBalance(balance);
		System.out.println("결과: 계좌가 생성되었습니다.");

		for (int i = 0; i < accountAry.length; i++) {
			if (accountAry[i] == null) {
				accountAry[i] = acc;
				break;
			}
		}
	}

	private static void accountList() {
		for (Account a : accountAry) {
			if (a != null) {
				System.out.println(a);
			}
		}

	}

	private static void deposit() {

	}

	private static void withdraw() {

	}

	private static Account findAccount(String ano) {

	}
}