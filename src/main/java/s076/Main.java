package s076;

public class Main {
    public static void main(String[] args) {
        Dog tom = new Dog("Tom");

        String name = tom.getName();
        double speed = tom.getSpeed();
        tom.setColor("orange");

        System.out.println("Name and speed: " + name + ", " + speed);
        System.out.println("Color:" + tom.getColor()); //get color è metodo classe pet. posso chiamarlo comunque perchè dog estende pet.
    }
}
