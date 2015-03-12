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


        String answer = format(234);

        //test
        if ( ! format(5).equals("V") ) {
            System.out.println("Error");
        }
        if ( parse("V") == 5)
            System.out.println("'V' Success!");



        //format: input int output string
        System.out.print(format(18)); /* it should return XVIII*/
        System.out.print(format(29)); /* it should return XXIX*/
        System.out.print(format(34)); /* it should return XXXIV*/
        System.out.print(format(46)); /* it should return XLVI*/
        System.out.print(format(89)); /* it should return LXXXiX*/
        System.out.print(format(846)); /* it should return DCCCXLVI*/
        System.out.print(format(1999)); /* it should return MCMXCIX*/
        System.out.print(format(2420)); /* it should return MMCDXX*/
        System.out.print(format(3454)); /* it should return MMMCDLIV*/
        System.out.print(format(3999)); /* it should return MMMCMXCIX*/




        //parse: input string output int
        System.out.print(parse("XVIII")); /* it should return 18*/
        System.out.print(parse("XXIX")); /* it should return 29*/
        System.out.print(parse("XXXIV")); /* it should return 34*/
        System.out.print(parse("XLVI")); /* it should return 46*/
        System.out.print(parse("LXXXiX")); /* it should return 89*/
        System.out.print(parse("DCCCXLVI")); /* it should return 846*/
        System.out.print(parse("MCMXCIX")); /* it should return 1999*/
        System.out.print(parse("MMCDXX")); /* it should return 2420*/
        System.out.print(parse("MMMCDLIV")); /* it should return 3454*/
        System.out.print(parse("MMMCMXCIX")); /* it should return 3999*/

    }
}
