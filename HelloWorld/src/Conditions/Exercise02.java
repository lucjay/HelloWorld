package Conditions;

public class Exercise02 {
	public static void main(String[] args) {
		int num1, num2;
		boolean run = true;
		while (run) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			if (num1 + num2 == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		
	}

}
