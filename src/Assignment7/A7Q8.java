/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author kathf6052
 */
public class A7Q8 {

    public boolean allOddDigits(int number) {
        // if the number is negative turn it positive
        if (number < 0) {
            number = number * -1;
        }
        int lastDigit = 0;
        // while loop when the number is more than 0
        while (number > 0) {

            // create a new variable and make it equal to the remainder of the number / 10
            lastDigit = number % 10;
            // make number equal 
            number = number / 10;
            if (lastDigit % 2 == 0) {
                return false;
            }
        }

        return true;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // create object
        A7Q8 method = new A7Q8();
        // ask the user to input a number
        System.out.println("Please enter a number");
        // assign what the user entered a variable
        int number = input.nextInt();
        // assign the method to a boolean
        boolean allOdd = method.allOddDigits(number);

        if (allOdd == true) {
            System.out.println("The numeber consists of all odd integers");
        }
        if (allOdd == false) {
            System.out.println("The number does not consist of all odd3 integers");
        }
    }
}
