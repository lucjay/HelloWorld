package Classes;

import java.util.Scanner;

public class PlayBaseBall {
	public static void main(String[] args) {
		int[] comAry = new int[3];
		for (int i = 0; i < 3; i++)
			comAry[i] = (int) (Math.random() * 9) + 1;
		for (int i = 0; i < 3; i++) {
			System.out.println(comAry[i] + " ");
		}
		System.out.println();
		Scanner scn = new Scanner(System.in);
		int[] userAry = new int[3];

		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.println("정수를 입력하세요.");
				userAry[i] = scn.nextInt();
			}
			int strike = 0, ball = 0;
			for (int i = 0; i < 3; i++) {
				for (int a = 0; a < 3; a++) {
					if (comAry[i] == userAry[a]) {
						if (i == a)
							strike++;
						else
							ball++;
					}
				}
			}
			System.out.println("strike: " + strike + ", ball: " + ball);
			if (strike == 3)
				break;
		}
		System.out.println("프로그램 종료");
	}
}
