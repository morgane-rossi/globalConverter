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

        if ((args.length == 2) || (args.length == 4)) {
            if (args[2].equals("-k")) {
                switch (args[0]) {
                    case "hexadecimal", "-h" -> System.out.println("Hexadecimal : " + args[1] + " Clé : " + args[3]);
                    case "decimal", "-d" -> System.out.println("Decimal : " + args[1] + " Clé : " + args[3]);
                    case "octal", "-o" -> System.out.println("Octal : " + args[1] + " Clé : " + args[3]);
                    case "binary", "-b" -> System.out.println("Binary : " + args[1] + " Clé : " + args[3]);
                    case "text", "-t" -> System.out.println("Text : " + args[1] + " Clé : " + args[3]);
                }
            } else {
                switch (args[0]) {
                    case "hexadecimal", "-h" -> System.out.println("Hexadecimal : " + args[1]);
                    case "decimal", "-d" -> System.out.println("Decimal : " + args[1]);
                    case "octal", "-o" -> System.out.println("Octal : " + args[1]);
                    case "binary", "-b" -> System.out.println("Binary : " + args[1]);
                    case "text", "-t" -> System.out.println("Text : " + args[1]);
                }
            }
        } else {
            System.out.println("Nooon !!");
        }



    }
}
