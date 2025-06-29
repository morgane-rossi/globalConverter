package globalConvertor;

import java.util.Vector;

public class Hexadecimal extends Base {

	/*
	 * returns a String that represents 
	 * 	hexadecimal values from a text input
	 * characters are separated by a space character
	 * */
	@Override
	public String converting(CharStr arrayChar) {

		StringBuilder result = new StringBuilder();
		int textLength = arrayChar.characters.length;

		for(int k = 0 ; k < textLength ; k++) {
			int nbHexa = arrayChar.decimalsArray[k];
			boolean stillNumbers = true;
			Vector<String> v = new Vector<>();
			while(stillNumbers) {
				
				int nombre = nbHexa % 16;
				char c ;
				switch(nombre) {
					case 10 :
						c = 'A';
						break;
					case 11 :
						c = 'B';
						break;
					case 12 :
						c = 'C';
						break;
					case 13 :
						c = 'D';
						break;
					case 14:
						c = 'E';
						break;
					case 15:
						c = 'F';
						break;
					default :
						c = (char) (nombre  + '0');
						break;
				}
				v.add(c + "");
				nbHexa /= 16;
				stillNumbers = (nbHexa > 0); 
			}

			int s = v.size();
			for (int l = s - 1 ; l >= 0 ; l--) {
				result.append(v.get(l));
			}
			result.append(" ");
		}
		return result.toString();
	}

	
	/*
	 * returns a int array that represents int values 
	 * from a hexadecimal String
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
    			
    			decimalNumb *=  16;    			
    			
				switch(numbers[k]) {
				case 'A' :
					decimalNumb += 10;
					break;
				case 'B':
					decimalNumb += 11;
					break;
				case 'C' :
					decimalNumb += 12;
					break;
				case 'D' :
					decimalNumb += 13;
					break;
				case 'E' :
					decimalNumb += 14;
					break;
				case 'F' :
					decimalNumb += 15;
					break;
				default :
					decimalNumb += ( numbers[k] - '0');
					break;
				}
    		}
    		decimalNumb -= key ;
    		fromConverted[j] = decimalNumb;
    	}
    	return fromConverted;
	}	
	
	
}
