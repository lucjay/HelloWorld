package referencetype;

public class MethodExample {
	public static void main(String[] args) {
		double s1 = divideBy(5, 3);
		System.out.println(s1);
		String result = printResult("이빈우");
		System.out.println(result);
		double s2 = calculator(5, 3, "-");
		System.out.println(s2);

	}

	public static double calculator(double a, double b, String cal) {
		double result = 1;
		if (cal.equals("+")) {
			result = a + b;
		} else if (cal.equals("-")) {
			result = a - b;
		} else if (cal.equals("*")) {
			result = a * b;
		} else if (cal.equals("/")) {
			result = a / b;
		} else if (cal.equals("%")) {
			result = a % b;
		}

		return result;
	}

	public static String printResult(String name) {
		return "반갑습니다 " + name + "님";
	}

	public static double divideBy(int a, int b) {
		double result = 0;
		result = (double) a / b;
		return result;
	}
}