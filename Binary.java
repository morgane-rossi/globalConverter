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
	public void converting(CharStr arrayChar) {

		StringBuilder answer = new StringBuilder();
		int textLength = arrayChar.characters.length;

		for(int k = 0 ; k < textLength ; k++) {
			int nbBinary = arrayChar.decimalsArray[k];
			boolean stillNumbers = true;
			Vector<String> v = new Vector<>();
			while(stillNumbers) {
				v.add((nbBinary % 2) + "");
				nbBinary /= 2;
				stillNumbers = (nbBinary > 0); 
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
