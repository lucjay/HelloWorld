package Operators;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println();
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result);
		System.out.println();
		
		int pencils = 534;
		int students = 30;
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
		System.out.println();
		
		int value = 8943;
		System.out.println(value -= value % 100);
		System.out.println();
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2.0;
		System.out.println(area);
		System.out.println();
		
		int a = 10;
		int b = 5;
		System.out.println((a > 7) && (b <= 5));
		System.out.println((a % 3 == 2) || (b % 2 != 1));
		System.out.println();
		
		double c = 5.0;
		double d = 0.0;
		double f = c % d;
		if (Double.isNaN(f)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double resultt = f + 10;
			System.out.println("결과: " + resultt);
		}
	}

}
