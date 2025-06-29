package globalConvertor;

import java.util.Scanner;

public class ProcessArgs
 {

	static Scanner entree = new Scanner(System.in);
	
	public ProcessArgs() {
		super();
	}
	
    public static void processArgs(CharStr chaineCar) throws InvalidArgumentsException {

    	// check base input
    	// Mode without key
 //   	System.out.println("Veuillez rentrer une base");

    	String base = "";
    	boolean validStringC = false ;
    	while (!validStringC) {

        	System.out.println("Veuillez rentrer une base");
    		base = entree.nextLine();    		
    		validStringC = (base.equals("-o") || base.equals("octal") || base.equals("-b") || base.equals("binary") || 
    		    	base.equals("-h") ||  base.equals("hexadecimal") || base.equals("-t") || base.equals("text") || 
    		    	base.equals("-d") || base.equals("decimal"));
    	}
 
        switch (base) {
            case "hexadecimal", "-h" -> {
            	chaineCar.base = "h";
            }
            
            case "decimal", "-d" -> {
            	chaineCar.base = "d";
            }
            case "octal", "-o" -> {
            	chaineCar.base = "o";
            }
            case "binary", "-b" -> {
            	chaineCar.base = "b";
            }
            case "text", "-t" -> {
            	chaineCar.base = "t";
            }
            default -> throw new InvalidArgumentsException("Unknown format: " + base);
        }
    	
    	/* Check that the String entry contains only letters, numbers and space character */

        String strInput ="";
        boolean validStringChar = false ;

            while (! validStringChar) {
                System.out.println("Veuillez saisir une chaîne de caractères");
                strInput = entree.nextLine();
                
                for (int i = 0 ; i < strInput.length() ; i++) {
                    validStringChar = (
                		strInput.charAt(i) == ' ' || 
                		strInput.charAt(i) >= 'A' && strInput.charAt(i) <= 'Z' ||
                		strInput.charAt(i) >= 'a' && strInput.charAt(i) <= 'z' || 
                		strInput.charAt(i) >= '0' && strInput.charAt(i) <= '9'    
                		);
                }

            }

            chaineCar.characters = strInput.toCharArray();


        System.out.println("Voulez-vous utiliser une clé de chiffrement\n"
        		+ "entrez  'oui', 'o', 'O', 'OUI' si vous voulez une clé");
        String keyOrNot = entree.nextLine();
        if (
        		keyOrNot.equals("oui") || keyOrNot.equals("OUI") || keyOrNot.equals("o") ||
        		keyOrNot.equals("O")) {


        		String cle = "";
        		boolean validInteger = false ;
        		while (!validInteger) {
            		System.out.println("entre un nombre entier, positif ou non, pour la clé de chiffrement");
        			cle = entree.nextLine();        			
        			validInteger = cle.matches("^-?[0-9]+$");
        		}
        	
            chaineCar.key = Integer.parseInt(cle) ;   

        }

    }
}
