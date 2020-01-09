package s081;

public class Simple { // eccezione unchecked perchè in riga 4 non c'è specificato "throws exception"
	private Object args;

	public int negate(int value) { // metodo negate: nega il valore inserito(3, ritorna -3)
		if (value == Integer.MIN_VALUE) { // eccezione perchè l'opposto del valore minimo non ci sta concretamente nella
											// memoria
			throw new IllegalArgumentException("Can't negate MIN_VALUE");
		}
		return -value;
	}

	public int negate2(int value) throws MyNegateException { // checked
		if (value == Integer.MIN_VALUE) {
			throw new MyNegateException(Integer.MAX_VALUE);
		}
		return -value;
	}

	public static void main(String[] args) {
		Simple simple = new Simple();
		if (args.length == 0) {
			System.out.println("No value!");
			return;
		}
		try { //abbiamo compattato due try-catch
			int value = Integer.parseInt(args[0]);
			System.out.println("negate" + value);
			int x= simple.negate2(value);
			System.out.println("My value negated is: " + x);
		} catch (NumberFormatException nfe) {
			System.out.println("Pass me an Integer!");
			return; //il return ferma il metodo, in questo caso nell'eventualità di un'eccezione
		}catch (MyNegateException mne) {
			System.out.println("My value negated is close to:" + mne.getAlternativeValue());
			return;
		}
		System.out.println("Ciao"); //se non dovessero esserci eccezioni la JVM fa questa istruzione
//		int value = 0;
//		try {
//			value = Integer.parseInt(args[0]); // ctrl su parseint - open declaration e si vede la docum.
//		} catch (NumberFormatException nfe) { // questa è l'eccezione già presente per questo metodo
//			System.out.println("Pass me an Integer!");
//			return;
//		}
//		try {
//			int x = simple.negate2(value);
			/**
			 * int x = simple.negate2(args.length); in args ci sono valori che si scrivono
			 * in riga di comando se in args si mette un numero, prima bisogna convertire la
			 * stringa in numero
			 */
//			System.out.println("My value negated is: " + x);
//		} catch (MyNegateException mne) {
//			System.out.println("My value negated is close to: " + mne.getAlternativeValue());
//		}
	}

}

class MyNegateException extends Exception { // creo classe della mia eccezione a cui do uno specifico nome, proprietà,
											// oggetti ecc..
	private static final long serialVersionUID = 1L;
	private int alternativeValue;

	public MyNegateException(int alternativeValue) {
		this.alternativeValue = alternativeValue; // inizializzata solo per mezzo del costrutt. il valore non è
													// modificabile perchè è privato
	}

	public int getAlternativeValue() { // ritorna il valore per fartelo leggere
		return alternativeValue;
	}

}
