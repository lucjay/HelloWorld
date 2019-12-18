package Operators;

public class BitReversOperatorExaple {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + "," + v1);
		System.out.println(toBinaryString(v2) + "," + v2);
		System.out.println(toBinaryString(v3) + "," + v3);

	}

	public static String toBinaryString(int val) {
		String str = Integer.toBinaryString(val);
		System.out.println(str);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}

}
