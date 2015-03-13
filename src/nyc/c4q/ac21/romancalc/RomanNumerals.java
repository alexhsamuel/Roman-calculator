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

    public static String format(int value) {
        if (value <= 0 || value > 3999)
            return "Error: not a valid Roman Numeral";
        String num$ = "";               //represents integer # inputted.

        while (value >= 1000) {        //Start with largest place. 1000's place.
            num$ += "M";               //Print M for each multiple of 1000;
            value = value - 1000;      //Remove 1000 from number. ex: 1984 = 1000 + 900 + 80 + 4
        }                                       //MCMLXXIV
        if (value >= 900) {
            num$ += "CM";   //         //100 less than a 1000. ex: 984 = 900 (CM) + 80 + 4
            value = value - 900;
        }
        if (value >= 500) {
            num$ += "D";
            value = value - 500;
        }
        if (value >= 400) {
            num$ += "CD";
            value = value - 400;
        }
        while (value >= 100) {
            num$ += "C";
            value -= 100;
        }
        if (value >= 90) {
            num$ += "XC";
            value -= 90;
        }
        if (value >= 60) {
            num$ += "LX";
            value -= 60;
        }
        if (value >= 50) {
            num$ += "L";
            value -= 50;
        }
        if (value >= 40) {
            num$ += "XL";
            value -= 40;
        }
        while (value >= 10) {
            num$ += "X";
            value -= 10;
        }
        if (value == 9) {
            num$ += "IX";
            value -= 9;
        }
        if (value >= 5) {
            num$ += "V";
            value -= 5;
        }
        if (value == 4) {
            num$ += "IV";
            value -= 4;
        }
        while (value >= 1) {
            num$ += "I";
            value -= 1;
        }
        //System.out.println(num$);
        return num$;
    }

    /**
     * Parses a number in Roman numerals.
     * @param number
     *   The number to parse.
     * @return
     *   The value, or -1 if the number isn't in Roman numerals.
     */
    public static int parse(String romanNum) {
        // TODO: Group 2: Write this function!

        // You will need:
        //   `number.length()` gives the length (number of characters) of the number
        //   `number.charAt(i)` gives the i'th character

        int total = 0;


        //romanNum.trim();

        for (int i = 0; i < romanNum.length(); i++) {
            if (romanNum.charAt(i) == 'M' || romanNum.charAt(i) == 'm')
                total = total + 1000;
            else if (romanNum.charAt(i) == 'D' || romanNum.charAt(i) == 'd')
                total = total + 500;
            else if (romanNum.charAt(i) == 'C' || romanNum.charAt(i) == 'c')
                total = total + 100;
            else if (romanNum.charAt(i) == 'L' || romanNum.charAt(i) == 'l')
                total = total + 50;
            else if (romanNum.charAt(i) == 'X' || romanNum.charAt(i) == 'x')
                total = total + 10;
            else if (romanNum.charAt(i) == 'V' || romanNum.charAt(i) == 'v')
                total = total + 5;
            else if (romanNum.charAt(i) == 'I' || romanNum.charAt(i) == 'i')
                total = total + 1;

        }

        if (romanNum.indexOf("CM") > -1 ||romanNum.indexOf("cm") > -1 )
            total = total - 200;
        if (romanNum.indexOf("CD") > -1 || romanNum.indexOf("cd") > -1)
            total = total - 200;
        if (romanNum.indexOf("XC") > -1 || romanNum.indexOf("xc") > -1)
            total = total - 20;
        if (romanNum.indexOf("XL") > -1 || romanNum.indexOf("xl") > -1)
            total = total - 20;
        if (romanNum.indexOf("IX") > -1 || romanNum.indexOf("ix") > -1)
            total = total - 2;
        if (romanNum.indexOf("IV") > -1 || romanNum.indexOf("iv") > -1)
            total = total - 2;

        //System.out.println(total);
        return total;


    }
    //return -1;


    public static void main(String[] argv) {
        // TODO: Group 3: Write this function!
        // It should test that format() and parse() work correctly.



    }
}

