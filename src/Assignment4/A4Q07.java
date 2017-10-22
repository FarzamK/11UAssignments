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
public class A4Q07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for user input
        Scanner userInput = new Scanner(System.in);




        // create piece

        int currentSquare = 1;

        // create loop

        while (currentSquare != 100) {
            System.out.println("Enter the sum of dice: ");
            int outputDice = userInput.nextInt();


            if (outputDice < 2 || outputDice > 12) {
                System.out.println("Please enter a number between 2 and 12");

            } else {



                if (outputDice == 0) {
                    System.out.println("You Quit!");
                    break;
                }



                if (currentSquare + outputDice > 100) {
                    System.out.println("You cannot go past 100, please try again");
                } else {


                    currentSquare = currentSquare + outputDice;

                    System.out.println("You are now on square " + currentSquare);

                    if (currentSquare == 9) {
                        currentSquare = 34;
                        System.out.println("You climbed up a ladder!");
                        System.out.println("You are now on square " + currentSquare);
                    }
                    if (currentSquare == 40) {
                        currentSquare = 64;
                        System.out.println("You climbed up a ladder!");
                        System.out.println("You are now on square " + currentSquare);
                    }
                    if (currentSquare == 54) {
                        currentSquare = 19;
                        System.out.println("Oops! You caught a snake!");
                        System.out.println("You are now on square " + currentSquare);
                    }
                    if (currentSquare == 67) {
                        currentSquare = 86;
                        System.out.println("You climbed up a ladder!");
                        System.out.println("You are now on square " + currentSquare);
                    }
                    if (currentSquare == 90) {
                        currentSquare = 48;
                        System.out.println("Oops! You caught a snake!");
                        System.out.println("You are now on square " + currentSquare);
                        
                    }
                    if (currentSquare == 99) {
                        currentSquare = 77;
                        System.out.println("Oops you caught a snake!");
                        System.out.println("You are now on square " + currentSquare);
                    }
                    if (currentSquare == 100) {
                        System.out.println("You Win!");
                    }





                }

            }

        }
    }
}
