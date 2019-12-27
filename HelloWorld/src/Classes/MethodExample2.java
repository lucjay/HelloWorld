package Classes;

public class MethodExample2 {
	public static void main(String[] args) {
		double result = sum(3.3, 4.5);
		System.out.println("결과값은" + result);
		printString(5, "*");

		int[] intAry = { 2, 3, 4, 5, 6, 7 };
		int sum = sum(intAry);
		System.out.println("합계는 " + sum);
		sum = 0;
		sum = sum(intAry);
		System.out.println("합계는 " + sum);
		for (int i = 0; i < intAry.length; i++) {
			sum = sum + intAry[i];

		}

	}

	public static double sum(double a, double b) {
		return a + b;

	}

	public static int sum(int[] iary) {
		int sum = 0;
		for (int i = 0; i < iary.length; i++) {
			sum = sum + iary[i];
		}
		return sum;
	}

	public static void printString(int x, String str) {

		for (int i = 1; i <= x; i++) {
			for (int a = 1; a <= i; a++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
}