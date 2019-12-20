package s076;

public class Pet {
	private static final String DEFAULT_COLOR = "Grey";
	private static final String DEFAULT_NAME = "My pet";
    private String name;
    private String color;
    
    public Pet() {
		this(DEFAULT_NAME);
	}

    public Pet(String name) {
    	this(name, DEFAULT_COLOR);//this.name = name; this.color = DEFAULT_COLOR;
        }
    
    public Pet(String name, String color) {
        this.name = name;
        this.setColor(color);
        }

    public String getName() {
        return name;
    }

	public String getColor() { //metodo creato dal getter su color(property)
		return color;
	}

	public void setColor(String color) { //il set permette di modificare il colore
		this.color = color;				//metodo creato dal getter su color(property)
	}
}