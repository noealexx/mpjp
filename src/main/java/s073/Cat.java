package s073;

public class Cat extends Mammal {
    private Tail tail;

    public Cat(int gestationDays, int tailLen) { //costruttore. non ha return type, ha lo stesso nome della classe ed è solo public (no int, char ecc)
        super(gestationDays); //costruttore(?)
        this.tail = new Tail(tailLen); 
    }

    @Override
    public String toString() { 
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
    } // tail è un oggetto di tipo Tail. la JVM mi ritorna tail in stringa grazie al metodo toString
}
//le classi figlia (cat, dog, main) possono vedere tutte le proprietà della classe madre (mammal) 