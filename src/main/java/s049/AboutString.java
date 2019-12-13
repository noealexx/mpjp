package s049;

public class AboutString {
	public static void main(String[] args) {
		String s = "hello";
		String t = "world";
		String u = "or";
		System.out.println("s, t, u: " + s + ", " + t + ", " + u);

		System.out.println("char at position 1 in s: " + s.charAt(1));

		System.out.println("s < t: " + s.compareTo(t));
		System.out.println("t > s: " + t.compareTo(s));

		System.out.println("concat s and t: " + s.concat(t));

		System.out.println("t contains u? " + t.contains(u));

		String u2 = t.substring(1, 3);
		System.out.println("u2 = t.substring(1, 3): " + u2);
		System.out.println("t.substring(3): " + t.substring(3)); // inizia da 3, l'end è automaticamente la fine della
																	// stringa

		System.out.println("u equals u2? " + u.equals(u2));
		System.out.println("u == u2? " + (u == u2)); // la reference deve essere uguale. u e u2 hanno lo stesso valore
														// all'interno dell'oggetto, ma hanno indirizzi diversi.

		System.out.println("First index of 'l' is s: " + s.indexOf('l'));
		System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
		System.out.println("there is no 'x' in s: " + s.indexOf('x'));
		System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));// /".../" <-- modo per scrivere doppio apice
																		// senza terminare la stringa
		System.out.println("there is no \"lx\" in s: " + s.indexOf("lx")); // ritorna l'indice del carattere nel
																			// parametro

		System.out.println("check if an empty string is empty: " + "".isEmpty());

		System.out.println("s length: " + s.length());

		String s2 = s.replace('l', 'q'); // sostituisce tutti questi caratteri
		System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

		String[] splits = "one for me, one for you".split(" "); // genera un array e crea singole stringhe da inserire
		System.out.println("Splitting: ");
		for (String token : splits) { // for each
			System.out.println(token);
		}
		String joined = String.join(" ", splits); //metodo statico (class.metodo) --istanza (oggetto.metodo) unisce diverse stringhe in una unica
		System.out.println("Joining back [" + joined + "]");

		System.out.println("upper: " + s.toUpperCase()); // copia della stringa in maiuscolo 
		System.out.println("lower: " + "SHUT UP!".toLowerCase()); //copia della stringa in minuscolo

		System.out.println("trim [" + " la la la ".trim() + "]"); //toglie gli spazi bianchi all'inizio e alla fine della stringa

		String x = null;
		System.out.println("Sort of safe toString(): " + String.valueOf(x));
	} // String.valueOf(x) converte x (oggetto) in una stringa 
}
