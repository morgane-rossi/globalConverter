package globalConvertor;

public class Main {

	public static void main(String[] args) {
        try {
        	ChaineCar chaineCar = new ChaineCar();
        	ProcessArgs.processArgs(args, chaineCar);

        	System.out.println("taille = " + chaineCar.taille + " - base : " + chaineCar.base +
        			" - cle : " + chaineCar.cle);
       	
        } catch (InvalidArgumentsException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
