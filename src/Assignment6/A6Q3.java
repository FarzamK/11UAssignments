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
        
        for (int i = 0; i < 2; i++) {
            integer[i] = input.nextInt();

        }
        int arrange = 0;

        if (integer[0] > integer[1]) {

            arrange = integer[1];

            integer[1] = integer[0];

            integer[0] = arrange;



        }
        System.out.println("The numbers in order are:  " + integer[0] + ", " + integer[1] + ", ");




    }
}
