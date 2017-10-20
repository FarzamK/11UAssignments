/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author kathf6052
 */
public class A4Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Print out Please Print Your Name
        System.out.println("Please enter your name");
        //create a scanner
        Scanner name = new Scanner(System.in);
        //create a variable
        String firstName = name.nextLine();
        //Print out the greeting with thier name
        System.out.println("Hello " + firstName + ", How are you?");
    }
}
