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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  create a scanners for input
        Scanner marksInput = new Scanner(System.in);

        Scanner studentInput = new Scanner(System.in);
        // ask user to input students in the class
        System.out.println("How many students are in the class?");
        // define the students as an integer
        int students = studentInput.nextInt();
        // define the marks as a float
        double[] marks = new double[students];
        // ask the user for the marks 
        System.out.println("Enter the marks: ");
        // make calculation = 0 so we can do math with it later
        double calculation = 0;
        // for loop to get marks and do the calculations
        for (int i = 0; i < students; i++) {
            // putting the marks @ position "i"
            marks[i] = marksInput.nextDouble();
            // math for calculating the average
            calculation = calculation + marks[i];

        }
        // finalize the math and make sure it ends in 2 decimal places
        double average = (calculation / students);
        
        double average3 = Math.round(average * 100);
        double average4 = (average3 / 100.00);
        // display the info out to the user
        System.out.println("The class average is " + average4 + "%");

    }
}
