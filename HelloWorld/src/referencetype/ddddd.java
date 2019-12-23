package referencetype;

public class ddddd {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		sum = 0;
		for (int a = 1; a <= 100; a++) {
			if (a % 3 == 0)
				sum += a;
		}
		System.out.println(sum);

		int seven = 1;
		for (seven = 1; seven <= 100; seven++) {
			if (seven % 7 == 0)
				System.out.println(seven);
		}
		boolean run = true;
		while (run) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("실패"+num);
			if (num == 5) {
				System.out.println("성공"+num);
				run = false;
			}
		}
		int num2 = 1;
		while (num2 != 6) {
			num2 = (int) (Math.random() * 6) + 1;
			System.out.println("실패"+num2);
			if (num2 == 6) {
				System.out.println("성공"+num2);
				break;

			}

		}
	}
}