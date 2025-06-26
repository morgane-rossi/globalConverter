package globalConvertor;

public class Caesar {

	public static int[] toDecimalArray(ChaineCar tabchar) {
		 
		int lengthText = tabchar.characters.length;
		int[] decimalsArray = new int[lengthText];

		for(int j = 0 ; j < lengthText ; j++) {
			int decimal = (int) tabchar.characters[j];
			decimal += tabchar.key;
			decimalsArray[j] = decimal;
		}
		return decimalsArray ;
	}	
	
	
}
