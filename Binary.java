package globalConvertor;

import java.util.Vector;

public class Binary extends Base {

	public Binary() {
		this.nbBase = 2 ;
	}

	@Override
	/*
	 * returns a String that represents a binary array from a text input
	 * each character is displayed by a 8 length binary number
	 * characters are separated by a space character
	 * */
	public String converting(CharStr arrayChar) {

		StringBuilder result = new StringBuilder();
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
				result.append("0");
			}			
			
			for (int l = s - 1 ; l >= 0 ; l--) {
				result.append(v.get(l));
			}
			result.append(" ");
		}
		return result.toString();
	}

	
	/*
	 * returns a int array that represents int values 
	 * from a binary String
	 * */
	@Override
	public int[] reverseConversion(String result, int key) {
		
		String space = " ";
		String[] convertedArrayStr = result.split(space);
		
		int sizeText = convertedArrayStr.length;
    	
    	int[] fromConverted = new int [sizeText];

    	for (int j = 0 ; j < sizeText ; j++) {
    		int decimalNumb = 0 ;
    		char[] numbers =  convertedArrayStr[j].toCharArray() ;

    		for (int k = 0 ; k < numbers.length ; k++) {
    			decimalNumb *=  2;
    			decimalNumb += ( numbers[k] - '0');
    		}
    		decimalNumb -= key ;
    		fromConverted[j] = decimalNumb;		
    	}
    	return fromConverted;
	}

}
