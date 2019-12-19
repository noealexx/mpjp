package ex;

public class Kata {
	static String noSpace(final String x) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			char cur = x.charAt(i);
			if (cur != ' ' ) { //apici singoli qui perchè cur è char. mettere a paragone gli stessi tipi
				sb.append(cur); //oppure if(!Character.isWhitespace(cur)
			}
			
		}
return sb.toString();
	}
}



//	static String noSpace(final String x) {
//		String s = x.replaceAll(" ", "");
//		return s;
//	}
//}


	
