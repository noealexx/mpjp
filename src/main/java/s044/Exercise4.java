package s044;

public class Exercise4 {
	public static void main(String[] args) {
		int[] data = { 5, 7, 1, 3, 4 };
		boolean seven = false;
		boolean one = false;
		for (int i = 0; i < data.length; ++i) {
			if (data[i] == 1) {
				System.out.println("1 è in posizione " + i);
				one = true;
			} else {
				System.out.println("not found");
			}
			if (data[i] == 7) {
				System.out.println("7 è in posizione " + i);
				seven = true;
			} else {
				System.out.println("not found");

			}
		}
	}

}
