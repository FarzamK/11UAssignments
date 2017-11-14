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
public class A4Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for inpit
        Scanner input = new Scanner(System.in);
        //print out text to tell user to put in inches
        System.out.println("Please enter the measurement in inches you wish to convert");
        // let the user type in inches
        double inches = input.nextDouble();
        // declare a variable and do the math
        double centi = inches * 2.54;
        // 
        System.out.println(inches + " inches is the same as " + centi + "cm");

        while (inches < 0) {
            System.out.println("Please enter a value above 0");

            inches = input.nextDouble();
        }

    }
}
