package referencetype;

import java.util.Scanner;

public interface Arrayyy {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0, menu = 0, amt = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------");
			System.out.println("1.입력 2.합계 3.평균 4.종료");
			System.out.println("---------------------");
			System.out.println("선택 > ");
			menu = scanner.nextInt();
			scanner.nextLine();
			int[] num = new int[5];
			if (menu == 1) {
				for (int i = 0; i < 5; i++)
					num[i] = i + 1;
				System.out.print("점수를 입력하세요 >");
				num[i] = scanner.nextInt();
				balance = balance + amt;
			} else if (menu == 2) {
				System.out.print("합계>");
				amt = scanner.nextInt();
				balance = balance - amt;
			} else if (menu == 3) {
				int summary = 0;
				double avg = 0;
				avg = (double) summary / num.length;
				System.out.print("평균>" + balance);
			} else if (menu == 4) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

}