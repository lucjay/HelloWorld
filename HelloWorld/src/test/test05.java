package test;

import java.util.Scanner;

public class test05 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("품명 : ");
		String item = sc.nextLine();
		System.out.println("수량 : ");
		int qty = sc.nextInt();
		System.out.println("단가 : ");
		int price = sc.nextInt();

		compute(item, qty, price);

	}

	public static void compute(String item, int qty, int price) {

		System.out.println("품명 : " + item);
		System.out.println("금액 : " + qty * price);
	}
}