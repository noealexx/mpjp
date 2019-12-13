package s049;

public class MyString {
	static int compareTo(String s, String t) {
		int lengthS = s.length(); // per sapere la lunghezza di s
		int lengthT = t.length(); // lunghezza di t
		int minLength = 0; // var del min

		if (lengthS < lengthT) {
			minLength = lengthS;
		} else {
			minLength = lengthT;
		}

		for (int i = 0; i < minLength; i++) {
			if (s.charAt(i) < t.charAt(i)) {
				return -1;
			} else if (s.charAt(i) > t.charAt(i)) {
				return +1;
			}
		}
		if (lengthS == lengthT) {
			return 0;
		} else if (lengthS < lengthT) {
			return -1;
		} else {
			return +1;
		}
	}

	public static void main(String[] args) {

		String s1 = "hello";  // da qui in giù è il test 
		String t1 = "world";

		int result = compareTo(s1, t1);

		System.out.println("hello vs world, result is: " + result);

		String s2 = "hello";
		String t2 = "hello";

		int result2 = compareTo(s2, t2);

		System.out.println("hello vs hello, result is: " + result2);

		String s3 = "hell";
		String t3 = "hello";

		int result3 = compareTo(s3, t3);

		System.out.println("hell vs hello, result is: " + result3);
	}
}