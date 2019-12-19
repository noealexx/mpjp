package ex;

public class EvenNumber {
	public static int[] divisibleBy(int[] numbers, int divider) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				count++;
			}
		}
		int[] divisible = new int[count];
		int i = 0;
		int cur = 0;
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[i] % divider == 0) {
				divisible[j] = numbers[i];
				cur++;
			}

		}
		return divisible;
	}

}
