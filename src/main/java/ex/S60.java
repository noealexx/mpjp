package ex;

public class S60 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder(); // creo sb perchè stringa è immutabile
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i)); // come fa ad appendere il carattere al primo posto????
		}
		return sb.toString(); // mi ritorna una stringa
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - 1 - i)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length(); i <= s.length(); i++) { // if (s.equals()) return "";
			char c = s.charAt(i);
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// TODO
		return 0;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];
var pos=0;
/**			la virgola permette all'interno di un ciclo di mettere più di una variabile di tipo int
 * for(int i=data.length-1; i>=0;i--){ oppure... for(int i=data.length-1, j=0; i>=0; j++, i--){
 * result[pos]=data[i];							uguale
 * pos++;										result[i]=data[data.length-1-i];
 */
for (int i = 0; i < data.length; i++) {
	result[i]=data[data.length-1-i];
}
		

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		double sum = 0;
		if (data == null) {
			System.out.println("data is null");
		}
		if (data.length == 0) {
			System.out.println("data length is 0");
		}
		for (int value : data) {
			sum += value;
//		for (int i=0; i < data.length; i++) {
//			sum += data[i];
		}
		return sum / data.length;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */

	public static int max(int[] data) {
//		if (data == null) {
//			System.out.println("data is null"); il sistema lancia eccezione, non si scrive.
//		}
//		if (data.length == 0) {
//			System.out.println("data length is 0"); NO PRINTLN!!! result max;
//		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++) { //for(int value: data)
												//if (value>max)
												//max=value;
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
}
