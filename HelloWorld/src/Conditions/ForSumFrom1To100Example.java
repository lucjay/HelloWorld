package Conditions;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
//			if (i % 2 == 1)
			sum += i;
		}
		System.out.println("홀수의합은:" + sum);
	}

}
