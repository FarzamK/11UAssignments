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
public class A7Q6 {
public int lastDigit(int number){
    // if statement to display last digit of a positive or a negative number
    if (number > 0){
    // get the remainder of the number the user entered
    int lastDigit = number % 10;
    // return the answer
    return lastDigit;
    // else statement
    }else{
        // turn the negative number into positive
        int positive = number * -1;
        // get the remainder of the number the user entered
        int lastDigit = positive % 10;
        // return answer
        return lastDigit;
    }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner in = new Scanner(System.in);
        // create object
        A7Q6 test = new A7Q6();
        // ask the user to enter a digit
        System.out.println("Please enter a number");
        // assign a variable to the number the user entered
        int number = in.nextInt();
        // assign the method a variable
        int lastDigit = test.lastDigit(number);
        // display out the answer 
        System.out.println("The last digit of the number is: " + lastDigit);
        
        
        
    }
}
