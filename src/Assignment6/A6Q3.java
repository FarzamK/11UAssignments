/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author kathf6052
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanners for input
        Scanner input = new Scanner(System.in);
        // create an array
        int[] integer = new int[2];
        // display out a statement to tell the user to put in the two numbers
        System.out.println("Enter two numbers");
        // for loop  
        for (int i = 0; i < 2; i++) {
            // assign what the user entered a variable
            integer[i] = input.nextInt();
        }
        // if statement if the 1st number is bigger than the second
        if (integer[0] > integer[1]) {
            // create a new variable and make it equal the second integer
           int arrange = integer[1];
            // turn the second integer into the first integer
            integer[1] = integer[0];
            // turn the first integer into the variable that we stored the second integer in
            integer[0] = arrange;
        }
        // display out the numbers 
        System.out.println("The numbers in order are:  " + integer[0] + ", " + integer[1] + ".");




    }
}
