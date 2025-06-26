package globalConvertor;

public class ProcessArgs
 {

	public ProcessArgs() {
		super();
	}
	
    public static void processArgs(String[] args) throws InvalidArgumentsException {

    	// Vérifier que la chaîne de caratères ne contient que des caractères alphanumériques
    	for (int i = 0 ; i < args[1].length() ; i++) {

            boolean est_valide = (
            		args[1].charAt(i) == ' ' || 
            		args[1].charAt(i) >= 'A' && args[1].charAt(i) <= 'Z' ||
            		args[1].charAt(i) >= 'a' && args[1].charAt(i) <= 'z' || 
            		args[1].charAt(i) >= '0' && args[1].charAt(i) <= '9'    
    );
            if (! est_valide) {
            	throw new InvalidArgumentsException("Second parameter must be a string"
+ " only made of alphabetic letters, numbers and ' ' sign");
            }
    	}
    	
    	if (args.length == 2) {
        	
        	// Mode without key
            switch (args[0]) {
                case "hexadecimal", "-h" -> System.out.println("Hexadecimal: " + args[1]);
                case "decimal", "-d" -> System.out.println("Decimal: " + args[1]);
                case "octal", "-o" -> System.out.println("Octal: " + args[1]);
                case "binary", "-b" -> System.out.println("Binary: " + args[1]);
                case "text", "-t" -> System.out.println("Text: " + args[1]);
                default -> throw new InvalidArgumentsException("Unknown format: " + args[0]);
            }
        } 
        
        // cas où on utilise une clé
        else if (args.length == 4) {
            if ( ! "-k".equals(args[2]) && ! "key".equals(args[2])) {
                throw new InvalidArgumentsException("Third argument must be \'-k\' or 'key'.");
            }
            else if 
            // la clé doit être un nombre entier, négatif ou positif
            	 (! args[3].matches("^-?[0-9]+$")){
            		 throw new InvalidArgumentsException("Fourth argument must be an integer number, eventually followed by '-' sign"); 
            }
            switch (args[0]) {
                case "hexadecimal", "-h" -> System.out.println("Hexadecimal: " + args[1] + " Key: " + args[3]);
                case "decimal", "-d" -> System.out.println("Decimal: " + args[1] + " Key: " + args[3]);
                case "octal", "-o" -> System.out.println("Octal: " + args[1] + " Key: " + args[3]);
                case "binary", "-b" -> System.out.println("Binary: " + args[1] + " Key: " + args[3]);
                case "text", "-t" -> System.out.println("Text: " + args[1] + " Key: " + args[3]);
                default -> throw new InvalidArgumentsException("Unknown format: " + args[0]);
            }
        } else {
            throw new InvalidArgumentsException("Number of arguments must be 2 or 4.");
        }
    }

}
