package globalConvertor;

public class Main {

	public static void main(String[] args) {
        try {
        	ChaineCar chaineCar = new ChaineCar();
        	ProcessArgs.processArgs(args, chaineCar);

        	int[] tabIntegers = Caesar.toDecimalArray(chaineCar);
        	for (int i = 0 ; i < tabIntegers.length ; i++) {
        		System.out.print(tabIntegers[i] + " ");
        	}
        	System.out.println();
       	
        } catch (InvalidArgumentsException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
