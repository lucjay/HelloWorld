package referencetype;

public class GetMaxValue {
	public static void main(String[] args) {
		int a = 5, b = 8, c = 3;
		int[] intAry = { 5, 8, 3 };
		int temp = 0;
		for (int s = 0; s < (intAry.length - 1); s++) {
			for (int i = 0; i < (intAry.length - 1); i++) {
				if (intAry[i] > intAry[i + 1]) {
					temp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + " ");
		}

	}
}
