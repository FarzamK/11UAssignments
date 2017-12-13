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
public class A7Q7 {

    public int firstDigit(int integer) {
        // if statement to make the number positive
        if (integer < 0) {
            // multiply the number by -1, to turn it positive
            integer = integer * -1;
        }
        // while loop to keep dividing the number until the first digit
        while (integer >= 10) {
            // divide the number by 10
            integer = integer / 10;
        }
        // return answer
        return integer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner in = new Scanner(System.in);
        // create object
        A7Q7 test = new A7Q7();
        // ask the user to enter a number
        System.out.println("Please enter a number");
        // assign what the user entered a variable
        int number = in.nextInt();
        // run the method and assign a variable to it
        int firstDigit = test.firstDigit(number);
        // display out the answer
        System.out.println("The first digit of the number is: " + firstDigit);



    }
}
