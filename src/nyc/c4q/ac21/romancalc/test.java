package nyc.c4q.ac21.romancalc;

import java.util.Scanner;

/**
 * Created by c4q-john on 3/10/15.
 */
public class test {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the Roman calculator. Type in a roman numeral");
        int leftNumber = userInput.nextInt();

        System.out.println("Please type a second roman numeral.");
        int rightNumber = userInput.nextInt();

        System.out.println("Please type an operator.");

        String operation = userInput.next();
        if (operation.equals("+")) {
            System.out.println(leftNumber + rightNumber);
        } else if (operation.equals("-")) {
            System.out.println(leftNumber - rightNumber);
        } else if (operation.equals("/")) {
            System.out.println(leftNumber / rightNumber);
        } else if (operation.equals("*")) {
            System.out.println(leftNumber * rightNumber);
        } else if (operation.equals("%")) {
            System.out.println(leftNumber % rightNumber);
        } else {
            System.out.println("Invalid operation.");
        }
    }
}
