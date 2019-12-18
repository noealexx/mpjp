package s073;

public class Tail {
    private int size; //proprietà

    public Tail(int size) { //da qui in giù sono metodi
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Tail [size=" + size + "]";
    }
}
