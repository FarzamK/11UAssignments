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
public class A4Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Please enter in 4 numbers on seperate lines: ");

        Scanner inputOne = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);
        Scanner inputThree = new Scanner(System.in);
        Scanner inputFour = new Scanner(System.in);

        double firstNum = inputOne.nextDouble();
        double secondNum = inputTwo.nextDouble();
        double thirdNum = inputThree.nextDouble();
        double fourthNum = inputFour.nextDouble();
        
        System.out.println("Your numbers were " + firstNum + ", " + secondNum + ", " + thirdNum + ", and " + fourthNum);



    }
}
