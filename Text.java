package globalConvertor;

public class Text extends Base {

	@Override
	public String converting(CharStr arrayChar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override

	/*
	 * returns a int array that represents int values 
	 * from String
	 * */
	public int[] reverseConversion(String result, int key) {

		String space = "";
		String[] convertedArrayStr = result.split(space);
		int sizeText = convertedArrayStr.length;
		char[] convertedChars = new char[sizeText];
		
		for (int i = 0 ; i < sizeText ; i++) {
			convertedChars[i] = convertedArrayStr[i].charAt(0);
		}
    	int[] fromConverted = new int [sizeText];

    	for (int j = 0 ; j < sizeText ; j++) {
    		fromConverted[j] = (int) convertedChars[j] - key;
    	}
    	return fromConverted;		
	}

}
