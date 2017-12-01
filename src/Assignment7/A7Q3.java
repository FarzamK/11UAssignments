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
public class A7Q3 {
    public void factor(int number){
        // for loop
        for (int i = 1; i < number; i++){
            
            // if statement to do the math
            if(number % i == 0){
                System.out.println(i);
            }
            
        }
        // display out the number
        System.out.println(number);
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create object to run methods
        A7Q3 run = new A7Q3();
        // create a scanner
        Scanner in = new Scanner(System.in);
        // ask the user for the number
        System.out.println("Please enter an integer that you would like the factors of");
        // create a variable and assign what the user entered
        int integer = in.nextInt();
        // display 
        System.out.println("The factors of " + integer + " are: ");
        // run the method 
        run.factor(integer);
        

        
        
    }
}
