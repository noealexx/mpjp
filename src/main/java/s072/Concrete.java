package s072;

// The type Concrete must implement the inherited abstract method
//public class Concrete extends Abstract { //tolgo il commento , mi da errore e la jvm mi consiglia di implementare il metodo. lo fa da solo.
//}

public class Concrete extends Abstract {
    @Override
    public void anAbstractMethod() {
        System.out.println("not abstract anymore");
    }
}
