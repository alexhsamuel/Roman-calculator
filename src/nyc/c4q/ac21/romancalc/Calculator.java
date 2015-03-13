package nyc.c4q.ac21.romancalc;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculator {

    /*public static boolean validate(String num){

        for(int index=0;index < num.length(); index=index+1){

            String currentChar=String.valueOf(num.charAt(index));

            System.out.println(currentChar);

            if  (      currentChar.equals("M")
                    || currentChar.equals("D")
                    || currentChar.equals("C")
                    || currentChar.equals("L")
                    || currentChar.equals("X")
                    || currentChar.equals("V")
                    || currentChar.equals("I") ){
            } else {
                return false;
            }
        }

        return true;
    }

    /**
     * Performs calculations on Roman numerals and prints the result.
     *
     * If either of the numbers are not Roman numerals, or if the operation is
     * unrecognized, prints an error message.  Otherwise, performs the
     * operation and prints the result in Roman numerals.  If the result is
     * less than 1 or larger than 3999, prints a message indicating this
     * instead.
     *
     *
     * @param leftNumber
     *   The left operand, in Roman numerals.
     * @param operation
     *   The operator, which may be,
     *   - "+" for addition,
     *   - "-" for subtraction,
     *   - "*" for multiplication,
     *   - "/" for (integer) division,
     *   - "%" for remainder,
     *   - "#" to average the two numbers.
     * @param rightNumber
     *   The right operand.
     */
    public static void calculate(String leftNumber, String operation, String rightNumber) {
        // TODO: Group 3: Write this function!


        int left = RomanNumerals.parse(leftNumber);
        int right = RomanNumerals.parse(rightNumber);
        int result = 0;

        if (left == -1 || right == -1) {
            System.out.println("Not a roman numeral! ");

        } else if (operation.equals("+")) {

            result = left + right;

        } else if (operation.equals("-")) {
            result = left - right;
        } else if (operation.equals("/")) {
            result = left / right;
        } else if (operation.equals("*")) {
            result = left * right;
        } else if (operation.equals("%")) {
            result = left % right;
        } else {
            System.out.println("Invalid operation.");


            if (result < 0) {
                System.out.println("Result is less than 1! It doesn't exist!");
            }

            if (result > 3999) {
                System.out.println("Result is higher than 3999, Romans couldn't count that high!");
            }

            String output = RomanNumerals.format(result);

            System.out.println(output);

        }
    }

    /**
     * Parses a decimal number.
     * @param number
     *   A decimal number, e.g. "459".
     * @return
     *   The value of the number, or -1 if it cannot be parsed.
     * @note
     *   This function is for testing only.  It should not be used in the final program.
     * @note
     *   You do not need to understand how this function works.
     */
    public static int parseDecimalNumber(String number) {
        try {
            return Integer.valueOf(number);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /**
     * @note
     *   You do not need to understand how this function works.
     */
    public static void main(String[] args) throws IOException {

        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Loop forever.
        while (true) {
            // Show the prompt.
            System.out.print("> ");
            // Read a line of input.
            final String line = reader.readLine();
            if (line.length() == 0) {
                System.out.println("done");
                break;
            }
            // Scan the line into three parts: two numbers with an operator between them.
            final Scanner scanner = new Scanner(line);
            final String leftNumber, operation, rightNumber;
            try {
                leftNumber = scanner.next();
                operation = scanner.next();
                rightNumber = scanner.next();
            }
            catch (NoSuchElementException e) {
                System.err.println("syntax error");
                System.out.println();
                continue;
            }


           /* if (! validate(leftNumber) || (! validate(rightNumber)))
                System.err.println("syntax error - LeftNumber not a roman numeral");
                System.out.println();
                continue;

            if (! validate(rightNumber))
                System.err.println("syntax error - rightNumber not a roman numeral");
                System.out.println();
                continue;

            // Perform the calculation and show the result.*/
           calculate(leftNumber, operation, rightNumber);



        }

    }
}

