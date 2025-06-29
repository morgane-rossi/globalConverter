package globalConvertor;

public class Decimal extends Base {

	/*
	 * returns a String that represents 
	 * decimal values from ASCII characters of user input
	 * */
	@Override
	public String converting(CharStr arrayChar) {

		StringBuilder result = new StringBuilder();
		int sizeTab = arrayChar.decimalsArray.length;
		for (int i = 0 ; i < sizeTab ; i++) {
			result.append(arrayChar.decimalsArray[i] + " ");
		}
		return result.toString();
	}

	@Override

	/*
	 * returns a int array that represents int values 
	 * from a int String
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
    			decimalNumb *=  10 ;
    			decimalNumb += ( numbers[k] - '0');
    		}
    		decimalNumb -= key ;
    		fromConverted[j] = decimalNumb;		
    	}
    	return fromConverted;
	}	
	
}
