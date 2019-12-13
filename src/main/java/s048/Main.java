package s048;

public class Main {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[10]; // abbiamo creato un array (Dog[]) per inserire i 10 Dog. dogs è variabile di
									// tipo array
		for (int i = 0; i < dogs.length; i++) { // questo loop serve solo per contare quanti dog creare
			dogs[i] = new Dog(); // dog è variabile locale al for. crea oggetto dog e lo associa all'array di
									// dog.
		}
		dogs[5].bark();
	}
}
