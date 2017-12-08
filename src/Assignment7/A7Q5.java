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
          
            for (int x = 0; x < asterisks; x++) {


                System.out.print("*");


            }
            System.out.println("");



        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A7Q5 test = new A7Q5();

        Scanner in = new Scanner(System.in);

        System.out.println("How many lines of * do you want?");

        int lineNumber = in.nextInt();

        test.chaotic(lineNumber);


    }
}