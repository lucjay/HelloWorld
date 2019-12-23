package referencetype;

public class ArrayCreateByNewExample2 {
	public static void main(String[] args) {
		int[][] intAry = new int[5][4];
		intAry[0][0] = 1;
		int num = 1;
		for (int s = 0; s < 5; s++) {
			for (int i = 0; i < 4; i++) {
				intAry[s][i] = num++;
			}
		}
		for (int a = 0; a < 5; a++) {
			for (int i = 0; i < 4; i++) {
				System.out.print(intAry[a][i] + " ");
			}
			System.out.println();
		}

	}
}