package referencetype;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };

		System.out.println(intAry[2]);
		intAry[2] = 30;
		System.out.println(intAry[2]);
		int sum = 0;
		for (int a = 0; a < 5; a++) {
			sum += intAry[a];
		}
		System.out.println(sum);

		int aaa = 0;
		for (int q = 0; q < 5; q++) {
			if (q % 2 == 0)
				aaa += intAry[q];
		}
		System.out.println(aaa);

		String[] strAry = { "Hello", "nice", "good", "worderful" };
		for (int i = 0; i < 4; i++)
			System.out.println(strAry[i]);

		int[] noo = new int[25];
		for (int n = 0; n < 25; n++) {
			noo[n] = n + 1;
		}
		for (int n = 0; n < 25; n++) {
			System.out.print(noo[n] + " ");
			if (n % 5 == 4)
				System.out.println();

		}
	}
}
