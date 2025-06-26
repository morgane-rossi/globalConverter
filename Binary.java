package globalConvertor;

import java.util.Vector;

public class Binary extends Base {

	public Binary() {
		this.nbBase = 2 ;
	}

	@Override
	/*
	 * displays a binary array from a text input
	 * each character is displayed by a 8 length binary number
	 * characters are separated by a space character
	 * */
	public void convertir(ChaineCar tabchar) {

		StringBuilder answer = new StringBuilder();
		int tailleTxT = tabchar.characters.length;

		for(int k = 0 ; k < tailleTxT ; k++) {
			int nbBinary = tabchar.decimalsArray[k];
			boolean encoreUnChiffre = true;
			Vector<String> v = new Vector<>();
			while(encoreUnChiffre) {
				v.add((nbBinary % 2) + "");
				nbBinary /= 2;
				encoreUnChiffre = (nbBinary > 0); 
			}

			int s = v.size();
			int reste = 8 - s ;
			for (int m = reste-1 ; m >= 0 ; m--) {
				answer.append("0");
			}			
			
			for (int l = s - 1 ; l >= 0 ; l--) {
				answer.append(v.get(l));
			}
			answer.append(" ");
		}
		System.out.println(answer.toString());
	}
}
