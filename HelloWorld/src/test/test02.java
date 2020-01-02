package test;

import java.util.Scanner;

public class test02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("값을입력:");
			int a = sc.nextInt();
			sc.nextLine();
			if (0 > a || 100 < a) {
				System.out.println("오류!");

			} else
				System.out.println("정상");
			break;
		}
	}
}
