package s075;

public class Dog {
	private static final String DEFAULT_NAME = "???";
	private static final int DEFAULT_WEIGHT = 7;

	private String name;
	private int weight;

	public Dog() { //costruttore di default
		this(DEFAULT_NAME, DEFAULT_WEIGHT);
	}

	public Dog(String name) { //costruttore
		this(name, DEFAULT_WEIGHT);
	}

	public Dog(int weight) { //costruttore
		this(DEFAULT_NAME, weight);
	}

	public Dog(String name, int weight) { //costruttore principale
		this.name = name; //this.name si riferisce alla proprietà name (riga7)
		this.weight = weight; //= name è il parametro dato in riga 22 che viene assegnato alla proprietà
	}

	public String getName() { //creo una proprietà. getname--> torna il nome, un valore
		return name;
	}

    @Override
    public String toString() {
        return "S71Dog [name=" + name + ", weight=" + weight + "]";
    }
}
