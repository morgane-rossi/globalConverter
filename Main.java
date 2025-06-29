package globalConvertor;

public class Main {

	/*
	 * calls conversing function
	 * from the right conversion class
	 * */
	static String callConversion(CharStr charStr) {
		String result = "";

    	switch (charStr.base) {
		case "h": {
			Hexadecimal h = new Hexadecimal();
			result = h.converting(charStr);
			break;
		}
		case "o": {
			Octal o = new Octal();
			result = o.converting(charStr);
			break;				
		}
		case "d": {
			Decimal d = new Decimal();
			result = d.converting(charStr);
			break;
		}
		case "b": {
			Binary b = new Binary();
			result = b.converting(charStr);
			break;
		}
		case "t": {
			StringBuilder stb = new StringBuilder();
			int lenText = charStr.decimalsArray.length;
			for (int i = 0 ; i < lenText ; i++) {
				stb.append( (char) charStr.decimalsArray[i] + "");
			}
			result = stb.toString();
			break;
		}
		default:
			return "";
		}
    	return result;
	}


	/*
	 * calls reverse conversing function
	 * from the right conversion class
	 * */
	static int[] callReverse(String result, String base, int key) {
		
		int[] fromConverted;
		
		switch (base) {

		case "h": {
			Hexadecimal h = new Hexadecimal();
			fromConverted = h.reverseConversion(result, key);
			break;
		}
		case "o": {
			Octal o = new Octal();
			fromConverted = o.reverseConversion(result, key);
			break;				
		}
		case "d": {
			Decimal d = new Decimal();
			fromConverted = d.reverseConversion(result, key);
			break;
		}
		case "b": {
			Binary b = new Binary();
			fromConverted = b.reverseConversion(result, key);
			break;
		}
		case "t" : {
			Text t = new Text();
			fromConverted = t.reverseConversion(result, key);
			break ;
		}
		
		default:
			return new int[result.length()];        	
    	}
		return fromConverted;
	}


	public static void main(String[] args) {
        try {
        	CharStr charStr = new CharStr();
        	 ProcessArgs.processArgs(charStr);
        	 String base = charStr.base;

        	
        	System.out.println("Texte original :");
            for (char c : charStr.characters) {
            	System.out.print(c);
            }
        	//        	System.out.println("PILOUUUUUUUUU" + charStr);
        	System.out.println("\nbase : " + base);

        	Caesar.toDecimalArray(charStr);
        	
        	String result = callConversion(charStr);

        	System.out.println("\nApres conversion :\n" + result + "\n");

        	int[] decimals =  callReverse(result, base, charStr.key);

        	System.out.println("Texte original :");
        	for (int l = 0 ; l < decimals.length ; l++) {
        		System.out.print((char) decimals[l]);
        	} 

        }
        catch (InvalidArgumentsException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
