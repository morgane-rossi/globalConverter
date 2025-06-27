package globalConvertor;

public class Main {

	public static void main(String[] args) {
        try {
        	CharStr chaineCar = new CharStr();
        	ProcessArgs.processArgs(args, chaineCar);

        	Caesar.toDecimalArray(chaineCar);

        	switch (chaineCar.base) {
			case "h": {
				
				Hexadecimal h = new Hexadecimal();
				h.converting(chaineCar);
				break;
			}
			case "o": {
				Octal o = new Octal();
				o.converting(chaineCar);
				break;				
			}
			case "d": {
				Decimal d = new Decimal();
				d.converting(chaineCar);
				break;
			}
			case "b": {
				Binary b = new Binary();
				b.converting(chaineCar);
				break;
			}
			case "t": {
				int lenText = chaineCar.characters.length;				
				for (int i = 0 ; i < lenText ; i++) {
					System.out.print(chaineCar.characters[i]);
				}
				System.out.println();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + chaineCar.base);
			}
			

        } catch (InvalidArgumentsException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
