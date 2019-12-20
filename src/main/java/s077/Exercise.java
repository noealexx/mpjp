package s077;

public class Exercise {
	public static void main(String[] args) {
		// array di pet con 1 dog e 1 cat
		// for each su arr di pet. cani abbaiano e i gatti miagolano

		Pet[] array = new Pet[6]; // Pet [] array = {new Dog("Bob"), new Dog("Willie").....}

		array[0] = new Dog("Bob");
		array[1] = new Dog("Willie");
		array[2] = new Dog("Jackie");

		array[3] = new Cat("Micio");
		array[4] = new Cat("Trilly");
		array[5] = new Cat("Pimpi");

		for (Pet pet : array) {
			if (pet instanceof Dog) {
				Dog dog = (Dog) pet; //variabile di dog. fondamentale per fare il bark
				dog.bark(); //((Dog) pet).bark();
			} else if (pet instanceof Cat) {
				Cat cat = (Cat) pet;
				cat.meow();
			}else {
				System.out.println("Unknown pet");
			}
			
		}
	}
}
