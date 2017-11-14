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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner for input
        Scanner peopleInput = new Scanner(System.in);
        Scanner heightInput = new Scanner(System.in);
        // Ask user how many people there are 
        System.out.println("How many people are there?");
        // turn the user input into an integer
        int people = peopleInput.nextInt();
        // create an array for the heights
        double[] heights = new double[people];
        // Ask user for the heights
        System.out.println("Please enter the heights:");   
        // Create a double and declare it as 0 to do the math with it later
        double calculation = 0;
        // for loop
        for (int i = 0; i < people; i++) {
            // create an array for what user inputs
            heights[i] = heightInput.nextDouble();
            // 
            calculation = calculation + heights[i];
            
            
        }
        double average = Math.round (calculation / people);
        
        System.out.println("The average height was " + average + "cm");
        
        for (int x = 0; x < people; x++){
          
            if(heights[x] > average){
                System.out.println(heights[x]);
                
                
            
        }
    }
        
    }
}
