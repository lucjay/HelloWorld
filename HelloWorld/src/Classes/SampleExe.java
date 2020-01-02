package Classes;

import java.util.Scanner;

class Sample {
	int price;
	String item;
	int qty;

	Sample() {
	}// ㄷㅣ폴트생성자

	Sample(int price) {
		this.price = price;
	}

	Sample(int price, String item) {
		this.price = price;
		this.item = item; // 생성자오버로딩
	}
}

public class SampleExe {
	public static void main(String[] args) {
		Sample sample = new Sample();
		Scanner scn = new Scanner(System.in);
		Sample[] samAry = new Sample[100];
		sample = new Sample(30, "apple");
		samAry[0] = 10;

		int[] intAry = new int[10];
		System.out.println("메뉴선택 1  2  3");
		int menu = scn.nextInt();
		scn.nextLine();
		System.out.println("다음선택");
		scn.nextLine();
		System.out.println("다음선택");
		scn.nextLine();

		// if (1 == 1 && 2 == 1) { // ||또는,&&이거둘다참
		// System.out.println("오류!");
//		} else {
		// int result = 3 + 5;
		// double result = 4 / 3;

		cal("item", 3, 1000);
	}

	static int cal(String a, int b, int c) {

		return 10;
	}
}
