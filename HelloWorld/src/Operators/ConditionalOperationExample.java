package Operators;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 96;
		String grade = "";
		if (score >= 90) {
			grade = "A";
			if (score >= 95)
				grade += "+";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85)
				grade += "+";
		} else {
			grade = "C";
		}
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
