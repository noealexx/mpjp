package s077;

public class Main {
    public static void main(String[] args) {
//		Cat cat = (Cat) new Dog();

        Pet pet = new Dog("Bob");//reference pet

        // risky
        Dog dog = (Dog) pet;//nuova copia con reference dog. stesso oggetto diversa reference
        dog.bark();//in questo modo posso far abbaiare dog 

//        // next line leads to a ClassCastException
//        Cat cat = (Cat) pet; //Dog cannot be cast to class s077.Cat
//        // next line is just not to have a warning for unused cat on the previous line
//        System.out.println(System.identityHashCode(cat));

        if (pet instanceof Cat) {
            Cat tom = (Cat) pet; //il nome della variabile è importante per i programmatori
            tom.meow();
        } else {
            System.out.println("This pet is not a cat!");
        }
        if (pet instanceof Dog) {
            Dog tom = (Dog) pet; //il nome della variabile è importante per i programmatori
            tom.bark();
    }
}
}
