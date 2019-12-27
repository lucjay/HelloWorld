package Classes;

class calculators {
	static double PI = 3.14159; // 정적변수 대문자, 두단어이상_ EARTH_AREA = 254354545;
	String color;

	void setColor(String color) {
		this.color = color;
	}

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int a, int b) {
		return a - b;
	}
}

public class CalculatorsEx {
	public static void main(String[] args) {
		calculators cal = new calculators();
		cal.color = "white";
		cal.setColor("black");
		cal.plus(4, 5);

		calculators.plus(6, 7);
	}
}