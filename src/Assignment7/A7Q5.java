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
public class A7Q5 {

    public void chaotic(int lineNumber) {
        // for loop 
        for (int i = 0; i < lineNumber; i++) {
            // create an integer and make a Math.random command.
          int asterisks = (int) (Math.random() * (5 - 1 + 1) + 1);
            // for loop
            for (int x = 0; x < asterisks; x++) {
                // display out the asterik with out the ln
                System.out.print("*");
            }
            // put a blank space
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create object
        A7Q5 test = new A7Q5();
        // create scanner
        Scanner in = new Scanner(System.in);
        // ask user the lines of asterisks they want
        System.out.println("How many lines of * do you want?");
        // assign what the user entered a variable
        int lineNumber = in.nextInt();
        // run the method
        test.chaotic(lineNumber);


    }
}