package s075;

public class Main {
	public static void main(String[] args) {
		Poodle poodle = new Poodle("Jim");
		Poodle p2 = new Poodle();
		Poodle p3 = new Poodle("Fido", 10);
		Poodle p4 = new Poodle("Tom", 6, 12);

		System.out.println(poodle);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}
