package globalConvertor;

public class Fusion {

	public static void main(String[] args) {
        try {
        	ProcessArgs.processArgs(args);
        } catch (InvalidArgumentsException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
