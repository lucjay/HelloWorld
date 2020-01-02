package test;

import java.util.Scanner;

public class test03 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("input name : ");
		String name = sc.nextLine();
		System.out.println("kor : ");
		int kor = sc.nextInt();
		System.out.println("eng : ");
		int eng = sc.nextInt();
		System.out.println("mat : ");
		int mat = sc.nextInt();
		sc.nextLine();

		int sum = kor + eng + mat;
		double avg = (double) sum / 3;
		String aa = String.format("%.1f", avg);

		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + sum + "점");
		System.out.println("평균점수 : " + aa);
	}
}
