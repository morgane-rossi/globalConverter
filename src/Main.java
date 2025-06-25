/*
 * Authors : Samy BELAZZOUG, Lorenzo OTTAVIANI and Morgane ROSSI.
 * Date : 24/06/2025 16h22
 * Aim of the program :
 *    Global convertor.
 * Input : ∅
 * Output : Conversion.
 */

public class Main {
    public static void main(String[] args) {
        try {
            processArgs(args);
        } catch (InvalidArgumentsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void processArgs(String[] args) throws InvalidArgumentsException {
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
        } else if (args.length == 4) {
            if (!"-k".equals(args[2])) {
                throw new InvalidArgumentsException("Third argument must be \"-k\".");
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

