package globalConvertor;

public class Caesar {

	/*
	 * converts a Character array to a integer array
	 * every integer represents ascii integer value
	 * of the character
	 * */
	public static void toDecimalArray(ChaineCar tabchar) {
		 
		int lengthText = tabchar.characters.length;
		int[] decimalsArray = new int[lengthText];

		for(int j = 0 ; j < lengthText ; j++) {
			int decimal = (int) tabchar.characters[j];
			decimal += tabchar.key;
			decimalsArray[j] = decimal;
		}
		tabchar.decimalsArray = decimalsArray;
	}
}
