package globalConvertor;

public class Main {

	public static void main(String[] args) {
        try {
        	ChaineCar chaineCar = new ChaineCar();
        	ProcessArgs.processArgs(args, chaineCar);
        	
        } catch (InvalidArgumentsException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
