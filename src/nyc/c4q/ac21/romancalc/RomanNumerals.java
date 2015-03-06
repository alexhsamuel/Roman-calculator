package nyc.c4q.ac21.romancalc;

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
        String result = "";
        assert(value < 4000);
        while (value >= 1000) {
            result += "M";
            value -= 1000;
        }
        if (value >= 900) {
            result += "CM";
            value -= 900;
        }
        if (value >= 500) {
            result += "D";
            value -= 500;
        }
        if (value >= 400) {
            result += "CD";
            value -= 400;
        }
        while (value >= 100) {
            result += "C";
            value -= 100;
        }
        if (value >= 90) {
            result += "XC";
            value -= 90;
        }
        if (value >= 50) {
            result += "L";
            value -= 50;
        }
        if (value >= 40) {
            result += "XL";
            value -= 40;
        }
        while (value >= 10) {
            result += "X";
            value -= 10;
        }
        if (value >= 9) {
            result += "IX";
            value -= 9;
        }
        if (value >= 5) {
            result += "V";
            value -= 5;
        }
        if (value >= 4) {
            result += "IV";
            value -= 4;
        }
        while (value > 0) {
            result += "I";
            value -= 1;
        }
        // At this point, the value will be zero.
        return result;
    }

    /**
     * Parses a number in Roman numerals.
     * @param number
     *   The number to parse.
     * @return
     *   The value, or -1 if the number isn't in Roman numerals.
     */
    public static int parse(String number) {
        int value = 0;
        int length = number.length();
        int i = 0;
        // Keep going until we reach the end of the string.
        while (i < length) {
            // Get the next character.
            char c = number.charAt(i);
            // Also get the one after that.  We need it to spot combinations like IV.
            char n;
            if (i < length - 1)
                n = number.charAt(i + 1);
            else
                // Careful!  Don't call charAt() beyond the end of the string.
                n = ' ';

            if (c == 'M') {
                value += 1000;
                i += 1;
            }
            else if (c == 'C' && n == 'M') {
                value += 900;
                i += 2;
            }
            else if (c == 'D') {
                value += 500;
                i += 1;
            }
            else if (c == 'C' && n == 'D') {
                value += 400;
                i += 2;
            }
            else if (c == 'C') {
                value += 100;
                i += 1;
            }
            else if (c == 'X' && n == 'C') {
                value += 90;
                i += 2;
            }
            else if (c == 'L') {
                value += 50;
                i += 1;
            }
            else if (c == 'X' && n == 'L') {
                value += 40;
                i += 2;
            }
            else if (c == 'X') {
                value += 10;
                i += 1;
            }
            else if (c == 'I' && n == 'X') {
                value += 9;
                i += 2;
            }
            else if (c == 'V') {
                value += 5;
                i += 1;
            }
            else if (c == 'I' && n == 'V') {
                value += 4;
                i += 2;
            }
            else if (c == 'I') {
                value += 1;
                i += 1;
            }
            else
                return -1;
        }
        return value;
    }

    /**
     * This program is for testing purposes: it goes through every number
     * between 1 and 3999, formats it as Roman numerals, and parses them
     * back.  If all works correctly, the parsed value should equal the
     * original value.
     */
    public static void main(String[] argv) {
        for (int value = 1; value < 4000; ++value) {
            final String romanNumeral = format(value);
            final int result = parse(romanNumeral);
            System.out.println(value + " = " + romanNumeral + " = " + result);
            if (value != result)
                System.err.println("ERROR!");
        }
    }
}
