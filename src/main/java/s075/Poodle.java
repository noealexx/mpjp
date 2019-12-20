package s075;

public class Poodle extends Dog {
	private static final int DEFAULT_DENSITY = 3; //default --> se nessuno mi da altri parametri, questo è il valore che userò.  
	private int curlDensity;
	
	public Poodle() {
		super();
		this.curlDensity = DEFAULT_DENSITY; //qui invece ricciolosità ha il valore definito da me.
		
	}

	public Poodle(String name) {
		super(name); //chiamata costruttore classe Dog. non do parametro ricciolosità quindi il costruttore me ne da uno di default. 
	}

	public Poodle(String name, int weight) {
		this(name, weight, DEFAULT_DENSITY);
	}

	public Poodle(String name, int weight, int curlDensity) {
		super(name, weight); //prima super, poi this
		this.curlDensity = curlDensity;
	}
	
	@Override
	public String getName() {
		return "Poodle " + super.getName();
	}
	
	@Override
	public String toString() {
		return "Poodle " + super.toString() + " " + curlDensity;
	}
}
