package nyc.c4q.ac21.romancalc;

import java.util.Scanner;

/**
 * Code to convert to and from Roman numerals.
 */

public class RomanNumerals {
    /**
     * Formats a number in Roman numerals.
     * @param value
     *   The value to format.
     * @return
     *   The value in Roman numerals.
     */
    static String format(int value) {
        // TODO: Group 1: Write this function!
        return "???";
    }

    /**
     * Parses a number in Roman numerals.
     * @param number
     *   The number to parse.
     * @return
     *   The value, or -1 if the number isn't in Roman numerals.
     */
    public static int parse(String number) {
        // TODO: Group 2: Write this function!
        
        // You will need:
        //   `number.length()` gives the length (number of characters) of the number
        //   `number.charAt(i)` gives the i'th character
        
        return -1;
    }

    public static void main(String[] argv) {
        // TODO: Group 3: Write this function!
        // It should test that format() and parse() work correctly.

        Scanner userInput = new Scanner(System.in);





        System.out.println("Welcome to the Roman calculator. Type in a roman numeral");
        int leftNumber = userInput.nextInt();

        System.out.println("Please type a second roman numeral.");
        int rightNumber = userInput.nextInt();

        System.out.println("Please type an operator.");
        userInput.nextFloat();

        String operation = userInput.next();
        if (operation.equals("+")) {
            System.out.println(leftNumber+rightNumber);
        } else if (operation.equals("-")) {
            System.out.println(leftNumber-rightNumber);
        } else if (operation.equals("/")) {
            System.out.println(leftNumber/rightNumber);
        } else if (operation.equals("*")) {
            System.out.println(leftNumber*rightNumber);
        } else if (operation.equals("%")) {
            System.out.println(leftNumber%rightNumber);
        } else {
            System.out.println("Invalid operation.");
        }









    }
}
