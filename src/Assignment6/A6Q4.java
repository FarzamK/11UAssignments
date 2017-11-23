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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanners for input
        Scanner input = new Scanner(System.in);
        // create an array
        int[] grades = new int[10];
        // display out a statement to tell the user to put in the two numbers
        System.out.println("Enter ten marks");
        // for loop  
        for (int i = 0; i < 10; i++) {
            grades[i] = input.nextInt(); 
        }
        
        for(int z = 0; z < grades.length; z++){
        
        for(int y = 0; y < grades.length-1; y++){
            if(grades[y] > grades[y+1]){
                int store = grades[y];
                
                grades[y] = grades[y+1];
                
                grades[y+1] = store;
            }
            System.out.println("The marks in ascending order are: ");
            for(int p = 0; p < grades.length; p++){
                System.out.println(grades[p]);
            }
        }
    }
}
}