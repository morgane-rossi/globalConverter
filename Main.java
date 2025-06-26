package globalConvertor;

public class Main {

	public static void main(String[] args) {
        try {
        	ChaineCar chaineCar = new ChaineCar();
        	ProcessArgs.processArgs(args, chaineCar);

        	Caesar.toDecimalArray(chaineCar);

        	switch (chaineCar.base) {
			case "h": {
				
				Hexadecimal h = new Hexadecimal();
				h.convertir(chaineCar);
				break;
			}
			case "o": {
				Octal o = new Octal();
				o.convertir(chaineCar);
				break;				
			}
			case "d": {
				Decimal d = new Decimal();
				d.convertir(chaineCar);
				break;
			}
			case "b": {
				Binary b = new Binary();
				b.convertir(chaineCar);
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
