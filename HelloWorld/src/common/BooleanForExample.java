package common;

public class BooleanForExample {
	public static void main(String[] args) {
		int var1 = 88;
		var1 = 10;
		System.out.println(var1);

			if (var1 > 90)
				if (var1>95)
				System.out.println(var1 + "=>A+");
				else
					System.out.println("A");
			else if (var1 > 80)
				System.out.println(var1 + "=>B");
			else if (var1 > 70)
				System.out.println(var1 + "=>C");
			else if (var1 > 60)
				System.out.println(var1 + "=>D");
			else
				System.out.println(var1 + "=>F");
		}
	}