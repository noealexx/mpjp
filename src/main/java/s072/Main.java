package s072;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate perchè è astratta
//        Abstract ma = new Abstract(); 
//        Abstract2 ma2 = new Abstract2();

        Abstract ma = new Concrete();
        ma.anAbstractMethod();

        Abstract2 ma2 = new Concrete2();
        ma2.aConcreteMethod();
    }
}
