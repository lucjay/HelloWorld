package Conditions;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0, menu = 0, amt = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------");
			System.out.println("1.예금 2.출금 3.잔액 4.종료");
			System.out.println("---------------------");
			System.out.println("선택>");
			menu = scanner.nextInt();
			scanner.nextLine();
			if (menu == 1) {	
				System.out.print("예금액>");
				amt = scanner.nextInt();
				balance = balance + amt;
			} else if (menu == 2) {
				System.out.print("출금액>");
				amt = scanner.nextInt();
				balance = balance - amt;
			} else if (menu == 3) {
				System.out.print("잔고>" + balance);
			} else if (menu == 4) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

}
