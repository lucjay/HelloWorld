package Classes;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountAry = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
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
		Account acc = new Account(); // 또는 set안쓰고Account acc = new Account(ano, owner, balance);
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
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (Account a : accountAry) {
			if (a != null) {
				System.out.println(a);
			}
		}
	}

	private static void deposit() {
		Account dp = new Account();
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		dp.setAno(ano);
		System.out.println("예금액: ");
		int bal = scanner.nextInt();
		Account accnt = findAccount(ano);
		int amount = accnt.getBalance();
		accnt.setBalance(bal + amount);
		System.out.println("결과: 예금이 성공되었습니다.");

	}

	private static void withdraw() {
		Account w = new Account();
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		w.setAno(ano);
		System.out.println("출금액: ");
		int bal = scanner.nextInt();
		Account accnt = findAccount(ano);
		int amount = accnt.getBalance();
		accnt.setBalance(amount - bal);
		System.out.println("결과: 출금이 성공되었습니다.");
	}

	private static Account findAccount(String ano) {
		Account accnt = null;
		for (Account acnt : accountAry) {
			if (acnt != null)
				if (ano.equals(acnt.getAno())) {
					accnt = acnt;
					break;
				}
		}
		return accnt;
	}
}
