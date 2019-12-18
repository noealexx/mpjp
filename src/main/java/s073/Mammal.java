package s073;

public abstract class Mammal { //classe astratta di mammiferi con proprietà concrete
    protected int gestation; 

    public Mammal(int gestation) {
        this.gestation = gestation; //reference all'oggetto corrente (quello blu in alto) = al gestation più vicino al parametro (parametro)
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}
