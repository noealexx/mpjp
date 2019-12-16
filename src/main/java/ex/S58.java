package ex;

public class S58 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		if (value > 0) {
			return "positive";
		} else if (value < 0) {
			return "negative";
		} else {
			return "0";
		}
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return true or false
	 */
	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		switch (value) {
		case 1:
			return "zero";
		case 2:
			return "one";
		case 3:
			return "two";
		case 4:
			return "three";
		case 5:
			return "four";
		case 6:
			return "five";
		case 7:
			return "six";
		case 8:
			return "seven";
		case 9:
			return "eight";
		default:
			return "other";

		}

	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		// TODO
		return 'F';
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		// TODO
		return false;
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];

		// TODO

		return result;
	}
}
