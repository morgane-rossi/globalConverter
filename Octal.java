package globalConvertor;

import java.util.Vector;

public class Octal extends Base {

	@Override
	/*
	 * displays octal values from a text input
	 * characters are separated by a space character
	 * */
	public void convertir(ChaineCar tabchar) {

		StringBuilder answer = new StringBuilder();
		int tailleTxT = tabchar.characters.length;

		for(int k = 0 ; k < tailleTxT ; k++) {
			int nbOcta = tabchar.decimalsArray[k];
			boolean encoreUnChiffre = true;
			Vector<String> v = new Vector<>();
			while(encoreUnChiffre) {
				v.add((nbOcta % 8) + "");
				nbOcta /= 8;
				encoreUnChiffre = (nbOcta > 0); 
			}
			int s = v.size();
			for (int l = s - 1 ; l >= 0 ; l--) {
				answer.append(v.get(l));
			}
			answer.append(" ");
		}
		System.out.println(answer.toString());
	}

}
