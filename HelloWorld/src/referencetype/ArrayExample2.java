package referencetype;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] num = new int[25];
		int summary = 0;
		double avg = 0;
		System.out.println("배열의 크기: " + num.length);

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		int sum = 0;
		for (int a = 0; a < 25; a++) {
			sum += num[a];
		}
		System.out.println("합은:" + sum);

		avg = (double) sum / num.length;
		System.out.println("평균은:" + avg);
	}
}
