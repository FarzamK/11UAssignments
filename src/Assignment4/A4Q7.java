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
public class A4Q7 {

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
                } else {



                    if (currentSquare + outputDice > 100) {
                        System.out.println("You cannot go past 100, please try again");
                    } else {


                        currentSquare = currentSquare + outputDice;

                        System.out.println("You are now on square " + currentSquare);

                        if (currentSquare == 9) {
                            currentSquare = 34;
                        }
                        if (currentSquare == 40) {
                            currentSquare = 64;
                        }
                        if (currentSquare == 54) {
                            currentSquare = 19;
                        }
                        if (currentSquare == 67) {
                            currentSquare = 86;
                        }
                        if (currentSquare == 90) {
                            currentSquare = 48;
                        }
                        if (currentSquare == 99) {
                            currentSquare = 77;
                        }
                        if (currentSquare == 100) {
                            System.out.println("You Win!");
                        }





                    }

                }

            }
        }
    }
}