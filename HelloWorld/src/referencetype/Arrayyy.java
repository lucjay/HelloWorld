package referencetype;

import java.util.Scanner;

public interface Arrayyy {
	public static void main(String[] args) {
		boolean run = true;
		int[] studentAry = new int[5];
		int menu = 0, score = 0;
		int sum = 0;
		double avg = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("---------------------");
			System.out.println("1.입력 2.합계 3.평균 4.종료");
			System.out.println("---------------------");
			System.out.println("선택 > ");
			menu = scanner.nextInt();

			if (menu == 1) {
				System.out.print("점수를 입력하세요 >");
				score = scanner.nextInt();
				for (int i = 0; i < 5; i++) {
					if (studentAry[i] == 0) {
						studentAry[i] = score;
						break;
					}
				}
			} else if (menu == 2) {
				sum = 0;
				for (int i = 0; i < 5; i++) {
					if (studentAry[i] > 0)
						sum += studentAry[i];
				}
				System.out.print("합계>" + sum);

			} else if (menu == 3) {
				int cnt = 0;
				for (int i = 0; i < 5; i++) {
					if (studentAry[i] != 0)
						cnt++;
				}
				avg = (double) sum / cnt;
				System.out.print("평균>" + avg);
			} else if (menu == 4) {
				run = false;
			} else if (menu == 5)
				for (int i = 0; i < 5; i++) {
					System.out.println(studentAry[i]);

				}

		}
		System.out.println("프로그램 종료");
	}

}