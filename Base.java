package globalConvertor;

import java.util.Vector;

public abstract class Base {
	
	int nbBase;

	public Base() {
	}
	
	public abstract void convertir(ChaineCar tabchar);



	String convertToBase(int base, int[] decimals) {
		StringBuilder answer = new StringBuilder();
		int tailleTxT = decimals.length;

		// convertir chaque caractere en hexadecimal
		for(int k = 0 ; k < tailleTxT ; k++) {
			int nbHexa = decimals[k];
			boolean encoreUnChiffre = true;
			Vector<String> v = new Vector<>();
			while(encoreUnChiffre) {
//				System.out.print((nbHexa % 16) + " ");
				v.add((nbHexa % base) + "");
				nbHexa /= base;
				encoreUnChiffre = (nbHexa > 0); 
			}
			// ajouter à answer mon vector de string
			int s = v.size();
			for (int l = s - 1 ; l >= 0 ; l--) {
				answer.append(v.get(l));
			}
			answer.append(" ");
		}
		return answer.toString();
	}
	
	
}
