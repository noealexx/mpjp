package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList <> ();
	
		Scanner scanner = new Scanner (System.in);
		while (scanner.hasNext()) {
			String s=scanner.next();
			if (s.contentEquals("exit")) {
				break;
			}
			al.add(s);
		}
		System.out.println(al);
		scanner.close();
	}

}
