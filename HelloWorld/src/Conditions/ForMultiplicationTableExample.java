package Conditions;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		/*
		 * for (int m = 1; m <= 9; m++) { System.out.println(); for (int n = 2; n <= 9;
		 * n++) { System.out.print(n + "x" + m + "=" + (m * n) + " ");
		 * 
		 * }
		 */
		for (int s = 1; s <= 9; s++) {
			for (int t = 1; t <= s; t++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}