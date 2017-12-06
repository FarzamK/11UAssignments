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
public class A7Q4 {
public double compundInterest(double initial, double interest, int years){
    // do the math for the balance after the interest and the years
    double answer = initial * Math.pow (1 + interest, years);
    // return the answer
    return answer;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object
        A7Q4 test =  new A7Q4();
        // create a scanner
        Scanner in = new Scanner(System.in);
        // ask the user for the initial balance
        System.out.println("What is the initial balance?");
        // assign what the user entered a variable
        double initial = in.nextDouble();
        // ask the user the interest rate
        System.out.println("What is the interest rate?");
        // assign what the user entered a variable and divide by 100 because the user is 
        // inputting the actual percent, not the decimal percent
        double interest = in.nextDouble() / 100;
        // ask how long the money is there 
        System.out.println("How long is the money there for, in years?");
        // assign what the user entered a variable
        int years = in.nextInt();
        // running the method and assigning a variable to it 
        double balance = test.compundInterest(initial, interest, years);
        // display out the answer
        System.out.println("You're remaining balance after " + years + " years is " + balance);
        
        
        
        
        
        
    }
}
