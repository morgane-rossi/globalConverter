package globalConvertor;

public class Caesar {

	/*
	 * converts a Character array to a integer array
	 * every integer represents ascii integer value
	 * of the character
	 * */
	public static void toDecimalArray(CharStr arrayChar) {
		 
		int lengthText = arrayChar.characters.length;
		int[] decimalsArray = new int[lengthText];

		for(int j = 0 ; j < lengthText ; j++) {
			int decimal = (int) arrayChar.characters[j];
			decimal += arrayChar.key;
			decimalsArray[j] = decimal;
		}
		arrayChar.decimalsArray = decimalsArray;
	}
}
