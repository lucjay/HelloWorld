package referencetype;

public class Ex {
	public static void main(String[] args) {
		int[][] Ary = new int[5][5];
		int num = 0;
		for (int i = 0; i < 5; i++) {
			for (int a = 0; a < 5; a++) {
				Ary[i][a] = num + 1;
				num++;
				System.out.print(Ary[i][a] + " ");
			}
			System.out.println();
		}
		System.out.println("==================");
		for (int i = 0; i < 5; i++) {
			for (int a = 0; a < 5; a++) {
				System.out.print(Ary[a][i] + " ");
			}
			System.out.println();
		}
		System.out.println("*****************");
		for (int i = 0; i < 5; i++) {
			for (int a = 0; a < 5; a++) {
				Ary[a][i] = num - 0;
				num--;
				System.out.print(Ary[a][i] + " ");
			}
			System.out.println();
		}
		System.out.println("################");
		for (int i = 0; i < 5; i++) {
			for (int a = 4; a >= 0; a--) {
				System.out.print(Ary[i][a] + " ");
			}
			System.out.println();
		}
		System.out.println("***************");
		for (int i = 0; i < 5; i++) {
			for (int a = 4; a >= 0; a--) {
				System.out.print(Ary[a][i] + " ");
			}
			System.out.println();
		}
	}
}