package globalConvertor;

import java.util.Vector;

public class Octal extends Base {

	@Override
	/*
	 * displays octal values from a text input
	 * characters are separated by a space character
	 * */
	public void converting(CharStr arrayChar) {

		StringBuilder answer = new StringBuilder();
		int textLength = arrayChar.characters.length;

		for(int k = 0 ; k < textLength ; k++) {
			int nbOcta = arrayChar.decimalsArray[k];
			boolean stillNumbers = true;
			Vector<String> v = new Vector<>();
			while(stillNumbers) {
				v.add((nbOcta % 8) + "");
				nbOcta /= 8;
				stillNumbers = (nbOcta > 0); 
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
