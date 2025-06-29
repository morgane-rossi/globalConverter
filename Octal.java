package globalConvertor;

import java.util.Vector;

public class Octal extends Base {

	/* returns a String that represents octal values from a text input
	 * characters are separated by a space character
	 * */
	@Override
	public String converting(CharStr arrayChar) {

		StringBuilder result = new StringBuilder();
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
				result.append(v.get(l));
			}
			result.append(" ");
		}
		return result.toString();
	}

	@Override
	/*
	 * returns a int array that represents int values 
	 * from a octal String
	 * */
	public int[] reverseConversion(String result, int key) {
		
		String space = " ";
		String[] convertedArrayStr = result.split(space);
		
		int sizeText = convertedArrayStr.length;
    	
    	int[] fromConverted = new int [sizeText];

    	for (int j = 0 ; j < sizeText ; j++) {
    		int decimalNumb = 0 ;
    		char[] numbers =  convertedArrayStr[j].toCharArray() ;

    		for (int k = 0 ; k < numbers.length ; k++) {
    			decimalNumb *=  8;
    			decimalNumb += ( numbers[k] - '0');
    		}
    		decimalNumb -= key ;
    		fromConverted[j] = decimalNumb;		
    	}
    	return fromConverted;
	}

}
