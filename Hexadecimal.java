package globalConvertor;

import java.util.Vector;

public class Hexadecimal extends Base {

	/*
	 * displays hexadecimal values from a text input
	 * characters are separated by a space character
	 * */
	public void converting(CharStr arrayChar) {

		StringBuilder answer = new StringBuilder();
		int textLength = arrayChar.characters.length;

		for(int k = 0 ; k < textLength ; k++) {
			int nbHexa = arrayChar.decimalsArray[k];
			boolean stillNumbers = true;
			Vector<String> v = new Vector<>();
			while(stillNumbers) {
				
				int nombre = nbHexa % 16;
				char c ;
				switch(nombre) {
					case 10 :
						c = 'A';
						break;
					case 11 :
						c = 'B';
						break;
					case 12 :
						c = 'C';
						break;
					case 13 :
						c = 'D';
						break;
					case 14:
						c = 'E';
						break;
					case 15:
						c = 'F';
						break;
					default :
						c = Character.forDigit(nombre, 10);
						break;
				}
				v.add(c + "");
				nbHexa /= 16;
				stillNumbers = (nbHexa > 0); 
			}
			// ajouter à answer mon vector de string
			int s = v.size();
			for (int l = s - 1 ; l >= 0 ; l--) {
				answer.append(v.get(l));
			}
			answer.append(" ");
		}
		System.out.println(answer.toString());
	}

}
