package referencetype;

//다섯개의 변수에 들어있는 값중에 가장큰수를 맥스벨류에 대입하는값을구하시어
public class ArrayExample3 {
	public static void main(String[] args) {
		int a = 6, b = 7, c = 3, d = 5, e = 9;
		int maxValue = 0;
		int[] intAry = { 6, 7, 3, 5, 9 };
		for (int i = 0; i < 5; i++) {
			if (maxValue < intAry[i])
				maxValue = intAry[i];
		}
		System.out.println("최대값은" + maxValue);

		int min = 10; //or int min = Integer.MAX_VALUE;
		for (int m = 0; m < 5; m++) {
			if (min > intAry[m])
				min = intAry[m];
		}
		System.out.println("최소값은" + min);
	}

}
