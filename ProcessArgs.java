package globalConvertor;

public class ProcessArgs
 {

	public ProcessArgs() {
		super();
	}
	
    public static String processArgs(String[] args, CharStr chaineCar) throws InvalidArgumentsException {

    	/* Check that the String entry contains only letters, numbers and space character */
    	for (int i = 0 ; i < args[1].length() ; i++) {

            boolean isValid = (
            		args[1].charAt(i) == ' ' || 
            		args[1].charAt(i) >= 'A' && args[1].charAt(i) <= 'Z' ||
            		args[1].charAt(i) >= 'a' && args[1].charAt(i) <= 'z' || 
            		args[1].charAt(i) >= '0' && args[1].charAt(i) <= '9'    
            		);
            if (! isValid) {
            	throw new InvalidArgumentsException("Second parameter must be a string"
            + " only made of alphabetic letters, numbers and ' ' sign");
            }
            chaineCar.characters = args[1].toCharArray();
    	}
    	
    	if (args.length == 3 || args.length > 4) {
            throw new InvalidArgumentsException("Number of arguments must be 2 or 4.");
    	}
    	
        // Here we use the ciper key
        if (args.length > 2) {
            if ( ! "-k".equals(args[2]) && ! "key".equals(args[2])) {
                throw new InvalidArgumentsException("Third argument must be \'-k\' or 'key'.");
            }
            else if 
            // cipher key must be a positive or negative integer
            	 (! args[3].matches("^-?[0-9]+$")){
            		 throw new InvalidArgumentsException("Fourth argument must be an integer number, eventually followed by '-' sign"); 
            }

            chaineCar.key = Integer.parseInt(args[3]) ;

        } 

    	// Mode without key
        switch (args[0]) {
            case "hexadecimal", "-h" -> {
            	System.out.println("Hexadecimal: " + args[1]);
            	chaineCar.base = "h";
            }
            
            case "decimal", "-d" -> {
            	System.out.println("Decimal: " + args[1]);
            	chaineCar.base = "d";
            }
            case "octal", "-o" -> {
            	System.out.println("Octal: " + args[1]);
            	chaineCar.base = "o";
            }
            case "binary", "-b" -> {
            	System.out.println("Binary: " + args[1]);
            	chaineCar.base = "b";
            }
            case "text", "-t" -> {
            	System.out.println("Text: " + args[1]);
            	chaineCar.base = "t";
            }
            default -> throw new InvalidArgumentsException("Unknown format: " + args[0]);
        }
        return chaineCar.base ;

    }
}
